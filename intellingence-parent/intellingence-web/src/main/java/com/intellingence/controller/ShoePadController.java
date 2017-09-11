package com.intellingence.controller;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.intellingence.dao.ChuangGanVoPlus;
import com.intellingence.entry.AmsuVo;
import com.intellingence.entry.ChuangGanVo;
import com.intellingence.pojo.ShoepadBangding;
import com.intellingence.pojo.ShoepadBangdingQuery;
import com.intellingence.pojo.ShoepadData;
import com.intellingence.pojo.ShoepadDataWithBLOBs;
import com.intellingence.pojo.ShoepadResult;
import com.intellingence.pojo.Userinfo;
import com.intellingence.pojo.UserinfoQuery;
import com.intellingence.pojo.UserinfoQuery.Criteria;
import com.intellingence.service.ShoePadDataService;
import com.intellingence.service.ShoepadBangdingService;
import com.intellingence.service.ShoepadResultService;
import com.intellingence.service.UserinfoService;
import com.intellingence.utils.HttpRequestUtils;
import com.intellingence.utils.JudgeCookieUtils;

@Controller
public class ShoePadController {

	@Value("${SHOEPAD_FILE_UPLOAD_PATH}")
	private String SHOEPAD_FILE_UPLOAD_PATH;
	@Autowired
	private ShoePadDataService shoePadDataService;
	@Autowired
	private ShoepadResultService shoepadResultService;
	@Autowired
	private UserinfoService userinfoService;
	@Autowired
	private ShoepadBangdingService shoepadBangidngService;

	/**
	 * 获取 access token
	 * 
	 * @param grant_type
	 * @param client_id
	 * @param client_secret
	 * @return
	 */
	@RequestMapping(value = "/getToken")
	@ResponseBody
	public String getToken(String username, String password) {
		String returnStr = null;
		try {
			returnStr = HttpRequestUtils.sendPost("https://gait.sennoapi.com/api/v1/token",
					"username=" + username + "&password=" + password);
		} catch (Exception e) {
			// TODO: handle exception
			returnStr = "{\"error\": \"unauthorized\",\"error_description\": \"client [client_id] dose not exist\"}";
		}
		return returnStr;
	}

	/**
	 * 
	 * 获取鞋垫分析数据.
	 *   //此处的id为user的id(不是电话号码)
	 * @param request
	 * @param access_token
	 * @param shoepadData
	 * @param leftFile
	 * @param rightFile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getShoepadDatas", method = { RequestMethod.POST })
	@ResponseBody
	public String getShoepadDatas(HttpServletRequest request, String access_token, ShoepadDataWithBLOBs shoepadData,
			MultipartFile leftFile, MultipartFile rightFile) throws Exception {
		String uid = JudgeCookieUtils.JudgeCookieContainsInneed4Shoepad(request, "id");
		
		//设置该列表当前状态为正常
		shoepadData.setUuid("1");
		// 1.将APP上传的参数和文件存储在服务器和数据库中.
		String urls = "https://gait.sennoapi.com/api/v1/gaits";
		// 设置相对路径 放到Tomcat里面
		String realPath = request.getSession().getServletContext().getRealPath("/shoepad");
		// String realPath = "/usr/local/tomcat/shoepad";
		// 上传图片
		File files = new File(realPath);
		// 如果该路径不存在就创建一个
		if (!files.exists()) {
			files.mkdirs();
		} 
		String leftnewName = getNewName(leftFile);
		String rightnewName = getNewName(rightFile);
		// 将前端的传来的文件的二进制流写入指定文件中
		File Lfile = new File(files + File.separator + leftnewName);
		File Rfile = new File(files + File.separator + rightnewName);
		leftFile.transferTo(Lfile);
		rightFile.transferTo(Rfile);

		//测试
		//============================================================================//
//		uid="13";  
		//============================================================================//
		
		shoepadData.setUserid(uid);

		shoepadData.setLeftfile(SHOEPAD_FILE_UPLOAD_PATH + leftnewName);
		shoepadData.setRightfile(SHOEPAD_FILE_UPLOAD_PATH + rightnewName);
    	String returnStr = null;

		// 2.发送模拟http请求,请求对方后台,并获得返回数据
		returnStr = HttpRequestUtils.httpClientUploadFile(leftFile, rightFile, shoepadData.getCreationtime(),
				shoepadData.getType(), shoepadData.getName(), shoepadData.getGender(), shoepadData.getAge(),
				shoepadData.getHeight(), shoepadData.getWeight(), shoepadData.getPhone(), shoepadData.getTag(),
				shoepadData.getLeftchecksum(), shoepadData.getRightchecksum(), access_token, urls);

		// 3.对返回数据进行处理,如果是返回成功的数据,将其存储在数据库中
	
		if (null != returnStr && returnStr.contains("D21")) {
			ChuangGanVo ganVo = JSON.parseObject(returnStr, ChuangGanVo.class);
			String string = HttpRequestUtils.sendGetWithHeaderWithoutParam(ganVo.getUrl().getD21(), access_token);
			returnStr = string;
			if (string.contains("NaN")) {
				string = string.replaceAll("NaN", "0");
			}
			ChuangGanVoPlus plus = JSON.parseObject(string, ChuangGanVoPlus.class);
			ShoepadResult shoepadResult = new ShoepadResult();
			shoepadResult.setUserid(uid);
			shoepadResult.setComment(plus.getHeader().getComment());
			shoepadResult.setDescription(plus.getHeader().getDescription());
			shoepadResult.setType(plus.getHeader().getType());
			shoepadResult.setCreationtime(plus.getHeader().getCreationTime());
			shoepadResult.setUuid(plus.getHeader().getUuid());
			shoepadResult.setVersion(plus.getHeader().getVersion());
			shoepadResult.setDataquality(plus.getGeneral().getDataQuality());
			shoepadResult.setDuration(plus.getGeneral().getDuration());
			shoepadResult.setStepcount(plus.getGeneral().getStepCount());
			shoepadResult.setSteprate(plus.getGeneral().getStepRate());
			shoepadResult.setStridelength(plus.getGeneral().getStrideLength());
			shoepadResult.setSymmetry(plus.getGeneral().getSymmetry());
			shoepadResult.setVariability(plus.getGeneral().getVariability());

			if (plus.getLeft().getEversion()) {
				shoepadResult.setEversionLeft(1);
			} else {
				shoepadResult.setEversionLeft(0);
			}
			if (plus.getLeft().getInversion()) {
				shoepadResult.setInversionLeft(1);
			} else {
				shoepadResult.setInversionLeft(0);
			}
			shoepadResult.setLandingpositionLeft(plus.getLeft().getLandingPosition().getFrontal() + "-"
					+ plus.getLeft().getLandingPosition().getSagital());
			shoepadResult.setStancedurationmeanLeft(plus.getLeft().getStanceDurationMean());
			shoepadResult.setStepheightmeanLeft(plus.getLeft().getStepHeightMean());
			shoepadResult.setSupportstabilitymeanLeft(plus.getLeft().getSupportStabilityMean());
			shoepadResult.setSwingwidthmeanLeft(plus.getLeft().getSwingWidthMean());

			if (plus.getRight().getEversion()) {
				shoepadResult.setEversionRight(1);
			} else {
				shoepadResult.setEversionRight(0);
			}
			if (plus.getRight().getInversion()) {
				shoepadResult.setInversionRight(1);
			} else {
				shoepadResult.setInversionRight(0);
			}
			shoepadResult.setLandingpositionRight(plus.getRight().getLandingPosition().getFrontal() + "-"
					+ plus.getRight().getLandingPosition().getSagital());
			shoepadResult.setStancedurationmeanRight(plus.getRight().getStanceDurationMean());
			shoepadResult.setStepheightmeanRight(plus.getRight().getStepHeightMean());
			shoepadResult.setSupportstabilitymeanRight(plus.getRight().getSupportStabilityMean());
			shoepadResult.setSwingwidthmeanRight(plus.getRight().getSwingWidthMean());
			shoepadResultService.insertSelective(shoepadResult);
			Integer id = shoepadResult.getId();
			shoepadData.setResultid(id);
			shoePadDataService.insert(shoepadData);
			// System.out.println(plus);
			// 把返回的数据分别存在数据库中
			// 首先是header
			// plus.getHeader().setUserid(userId);
			// headerService.insertSelective(plus.getHeader());
			// //其次是general
			// plus.getGeneral().setUserid(userId);
			// generalService.insertSelective(plus.getGeneral());
			// //最后是left和right 注意这个有特殊
			// Left left = leftPlus2Left(plus.getLeft(), userId);
			// leftService.insertLeft(left);
			// Right right = rightPlus2right(plus.getRight(), userId);
			// rightService.insertRight(right);
		}
		// System.out.println(returnStr);
		
		return returnStr;
	}

	/**
	 * 
	 * 获取鞋垫分析数据.
	 * 
	 * @param request
	 * @param access_token
	 * @param shoepadData
	 * @param leftFile
	 * @param rightFile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getShoepadDatas30seconds", method = { RequestMethod.POST })
	@ResponseBody
	public String getShoepadDatas30seconds(HttpServletRequest request, String access_token, ShoepadData shoepadData,
			MultipartFile leftFile, MultipartFile rightFile) throws Exception {

		String urls = "https://gait.sennoapi.com/api/v1/gaits";
		String returnStr = null;

		
		// 2.发送模拟http请求,请求对方后台,并获得返回数据
		returnStr = HttpRequestUtils.httpClientUploadFile(leftFile, rightFile, shoepadData.getCreationtime(),
				shoepadData.getType(), shoepadData.getName(), shoepadData.getGender(), shoepadData.getAge(),
				shoepadData.getHeight(), shoepadData.getWeight(), shoepadData.getPhone(), shoepadData.getTag(),
				shoepadData.getLeftchecksum(), shoepadData.getRightchecksum(), access_token, urls);
		// 3.对返回数据进行处理,如果是返回成功的数据
		
		if (null != returnStr && returnStr.contains("D21")) {
			ChuangGanVo ganVo = JSON.parseObject(returnStr, ChuangGanVo.class);
			String string = HttpRequestUtils.sendGetWithHeaderWithoutParam(ganVo.getUrl().getD21(), access_token);
			returnStr = string;
		}
		return returnStr;
	}

	private static String getNewName(MultipartFile file) {
		// 原始文件名称: 得到XXX.jpg类似这样的
		String oldName = file.getOriginalFilename();
		// 创建一个新的名字(防止重名覆盖)
		String str1 = UUID.randomUUID().toString();
		String str2 = oldName.substring(oldName.lastIndexOf("."));
		String newName = str1 + str2;
		return newName;
	}

	/**
	 * 根据cookie中的userid(cookie中叫做id)来获取该用户的鞋垫数据列表
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getShoepadList")
	@ResponseBody
	public List<ShoepadDataWithBLOBs> getShoepadList(HttpServletRequest request){
		String uid = JudgeCookieUtils.JudgeCookieContainsInneed4Shoepad(request, "id");
		//测试
		//============================================================================//
//		uid="13";
		//============================================================================//
		ShoepadDataWithBLOBs bolbs = new ShoepadDataWithBLOBs();
		bolbs.setUserid(uid);
		bolbs.setUuid("1");
		List<ShoepadDataWithBLOBs> list = shoePadDataService.selectShoepadList(bolbs);
		return list;
	}
	
	/**
	 * 根据shoepad_result里的id进行查询
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getShoepaddetails")
	@ResponseBody
	public Map<String,Object> getShoepaddetails(HttpServletRequest request,Integer id){
		String uid = JudgeCookieUtils.JudgeCookieContainsInneed4Shoepad(request, "id");
		//测试
		//============================================================================//
//		uid="10";
		//============================================================================//
		Integer intUid = Integer.parseInt(uid);
		UserinfoQuery query = new UserinfoQuery();
		Criteria criteria = query.createCriteria();
		criteria.andIdEqualTo(intUid);
		List<Userinfo> list = userinfoService.selectByExample(query);
		ShoepadDataWithBLOBs shoepadDataWithBLOBs = null;
		ShoepadResult shoepadResult  = null;
		if(null!=list&&list.size()==1){
			
			shoepadDataWithBLOBs = shoePadDataService.selectByPrimaryKey(id);
			if(null!=shoepadDataWithBLOBs){
				Integer dataId = shoepadDataWithBLOBs.getResultid();
				shoepadResult = shoepadResultService.selectByPrimaryKey(dataId);
			
			}
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("ShoepadData", shoepadDataWithBLOBs);
		resultMap.put("ShoepadResult", shoepadResult);
		return resultMap;
	}
	
	/**
	 * 绑定或修改绑定
	 * @param request
	 * @param leftDeviceMAC
	 * @param rightDeviceMAC
	 * @return
	 */
	@RequestMapping(value = "/bangdingshoepad")
	@ResponseBody
	public AmsuVo bangdingshoepad(HttpServletRequest request,String leftDeviceMAC,String rightDeviceMAC){
		AmsuVo vo = new AmsuVo();
		String uid = JudgeCookieUtils.JudgeCookieContainsInneed4Shoepad(request, "uid");
//		uid = "13522731203";
		UserinfoQuery query = new UserinfoQuery();
		Criteria createCriteria = query.createCriteria();
		createCriteria.andUseridEqualTo(uid);
		List<Userinfo> list = userinfoService.selectByExample(query);
		if(null!=list&&list.size()==1){
			//说明该用户存在且仅有一个
			ShoepadBangding record = new ShoepadBangding();
			record.setLeftdevicemac(leftDeviceMAC);
			record.setRightdevicemac(rightDeviceMAC);
			List<ShoepadBangding> bangding = shoepadBangidngService.selectBangding(record);
			if(null!=bangding&&bangding.size()>0){
				vo.setRet("-20001");
				vo.setErrDesc("该设备已经被绑定");
			}else{
				//说明该设备码没有被绑定
				ShoepadBangdingQuery example = new ShoepadBangdingQuery();
				com.intellingence.pojo.ShoepadBangdingQuery.Criteria criteria = example.createCriteria();
				criteria.andUseridEqualTo(list.get(0).getId());
				//此处获得的是该用户id是否已经绑定过设备
				List<ShoepadBangding> list2 = shoepadBangidngService.selectByExample(example);
				if(null!=list2&&list2.size()>0){
					//说明该用户绑定过设备
					record.setUpdatetime(new Date());
					record.setUserid(list.get(0).getId());
					shoepadBangidngService.updateBangding(record);
					vo.setRet("0");
					vo.setErrDesc("修改绑定成功");
					
				}else{
					//说明用户没绑定过设备
					record.setUpdatetime(new Date());
					record.setUserid(list.get(0).getId());
					shoepadBangidngService.insertSelective(record);
					vo.setRet("0");
					vo.setErrDesc("添加绑定成功");
				}
			}
		}else{
			vo.setRet("-20002");
			vo.setErrDesc("该用户不存在");
		}
		return vo;
	}
	
	/**
	 * 获取当前用户的绑定详情
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getBangdingDetails")
	@ResponseBody
	public AmsuVo getBangdingDetails(HttpServletRequest request){
		AmsuVo vo = new AmsuVo();
		String idStr = JudgeCookieUtils.JudgeCookieContainsInneed4Shoepad(request, "id");
//		idStr = "13";
		Integer id = Integer.parseInt(idStr);
		ShoepadBangdingQuery example = new ShoepadBangdingQuery();
		com.intellingence.pojo.ShoepadBangdingQuery.Criteria createCriteria = example.createCriteria();
		createCriteria.andUseridEqualTo(id);
		List<ShoepadBangding> list = shoepadBangidngService.selectByExample(example);
		if(null!=list&&list.size()>0){
			vo.setRet("0");
			vo.setErrDesc(list.get(0));
		}else{
			vo.setRet("1");
			vo.setErrDesc("此用户未绑定鞋垫");
		}
		return vo;
	}
	
	/**
	 * 解除绑定
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/deleteBangdingByUserid")
	@ResponseBody
	public AmsuVo deleteBangdingByUserid(HttpServletRequest request){
		AmsuVo vo = new AmsuVo();
		String idStr = JudgeCookieUtils.JudgeCookieContainsInneed4Shoepad(request, "id");
//		idStr = "13";
		Integer id = Integer.parseInt(idStr);
		ShoepadBangdingQuery example = new ShoepadBangdingQuery();
		com.intellingence.pojo.ShoepadBangdingQuery.Criteria createCriteria = example.createCriteria();
		createCriteria.andUseridEqualTo(id);
		shoepadBangidngService.deleteByExample(example);
		vo.setRet("0");
		vo.setErrDesc("解绑成功");
		return vo;
	}
	
	/**
	 * 左滑删除(修改状态)
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/deleteShoepadDataById")
	@ResponseBody
	public AmsuVo deleteShoepadDataById(HttpServletRequest request,Integer id){
		AmsuVo vo = new AmsuVo();
		String uid = JudgeCookieUtils.JudgeCookieContainsInneed4Shoepad(request, "uid");
//		uid = "13522731203";
		UserinfoQuery query = new UserinfoQuery();
		Criteria createCriteria = query.createCriteria();
		createCriteria.andUseridEqualTo(uid);
		List<Userinfo> list = userinfoService.selectByExample(query);
		if(null!=list&&list.size()==1){
			//用户存在
			ShoepadData data = new ShoepadData();
			data.setUserid(list.get(0).getId()+"");
			data.setId(id);
			data.setUuid("0");
			int i = shoePadDataService.updateShoepadState(data);
			if(i==1){
				vo.setRet("0");
				vo.setErrDesc("用户删除成功");
			}else{
				vo.setRet("-20001");
				vo.setErrDesc("用户删除失败,不存在该条记录");
				
			}
		}
		return vo;
	}
}