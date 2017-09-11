package com.intellingence.controller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.intellingence.entry.AmsuVo;
import com.intellingence.pojo.Contacts;
import com.intellingence.pojo.ContactsQuery;
import com.intellingence.pojo.Userinfo;
import com.intellingence.pojo.UserinfoQuery;
import com.intellingence.pojo.UserinfoQuery.Criteria;
import com.intellingence.service.ContactsService;
import com.intellingence.service.UserinfoService;
import com.intellingence.utils.CheckDatas;
import com.intellingence.utils.JudgeCookieUtils;
/**
 * 关于登录用户的controller
 * @author 梦里不知身是客
 *
 */
@Controller
public class UserinfoController {
	@Autowired
	private UserinfoService userinfoService;
	@Autowired
	private ContactsService contactsService;

	@RequestMapping(value = "/uploadUserinfo", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo uploadUserinfo(String userName, String sex, String birthday, String weight, String height,
			String address, String phone, String email, HttpServletRequest request) {
		AmsuVo amsuVo = new AmsuVo();
		// 对参数进行校验
		if (StringUtils.isBlank(userName) || StringUtils.isBlank(sex) || StringUtils.isBlank(birthday)
				|| StringUtils.isBlank(weight) || StringUtils.isBlank(height) || StringUtils.isBlank(address)
				|| StringUtils.isBlank(phone)) {
			amsuVo.setRet("-20003");
			amsuVo.setErrDesc("传入参数不完全!");
			return amsuVo;
		}
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		String userid = JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid");
		// String userid = "13522731203";
		Integer sexInt = null;
		try {
			sexInt = Integer.parseInt(sex);
			if (sexInt != 1 && sexInt != 2) {
				amsuVo.setRet("-20003");
				amsuVo.setErrDesc("传入参数不正确!");
				return amsuVo;
			}
		} catch (Exception e) {
			e.printStackTrace();
			amsuVo.setRet("-20003");
			amsuVo.setErrDesc("传入参数不正确!");
			return amsuVo;
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String s = birthday;
		Date birthdayDate = null;
		try {
			birthdayDate = formatter.parse(s);
		} catch (ParseException e) {
			amsuVo.setRet("-20002");
			amsuVo.setErrDesc("日期格式错误!");
			e.printStackTrace();
			return amsuVo;
		}
		Float weightFloat = null;
		try {
			weightFloat = Float.parseFloat(weight);
		} catch (Exception e) {
			e.printStackTrace();
			amsuVo.setRet("-20003");
			amsuVo.setErrDesc("传入参数不正确!");
			return amsuVo;
		}
		Float heightFloat = null;
		try {
			heightFloat = Float.parseFloat(height);
		} catch (Exception e) {
			e.printStackTrace();
			amsuVo.setRet("-20003");
			amsuVo.setErrDesc("传入参数不正确!");
			return amsuVo;
		}
		if (!CheckDatas.checkMobileNO(phone)) {
			amsuVo.setRet("-20003");
			amsuVo.setErrDesc("手机号格式不正确!");
			return amsuVo;
		}
		if (!CheckDatas.checkEmaile(email)) {
			amsuVo.setRet("-20003");
			amsuVo.setErrDesc("邮箱格式不正确!");
			return amsuVo;
		}

		Userinfo userinfo = new Userinfo();
		userinfo.setUserid(userid);
		userinfo.setUsername(userName);
		userinfo.setSex(sexInt);
		userinfo.setWeight(weightFloat);
		userinfo.setHeight(heightFloat);
		userinfo.setBirthday(birthdayDate);
		userinfo.setAddress(address);
		userinfo.setPhone(phone);
		userinfo.setEmail(email);
		userinfo.setType(0);
		userinfo.setUpdatetime(new Date());
		// 设置成FALSE 在数据库中为0代表正常 设置为ture 数据库中为1 代表删除
		userinfo.setState(false);
		// 判断数据库中是否存在该userid对应的数据
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		List<Userinfo> list = userinfoService.selectByExample(example);
		// 如果数据库中有该号码,说明该号码的信息已经填写完毕,所以是修改
		if (list != null && list.size() == 1) {
			userinfo.setId(list.get(0).getId());
			userinfo.setUpdatetime(new Date());
			userinfoService.updateByPrimaryKeySelective(userinfo);
		} else {
			userinfo.setCreatetime(new Date());
			userinfoService.insertSelective(userinfo);
		}
		amsuVo.setRet("0");
		amsuVo.setErrDesc("操作成功!");
		return amsuVo;
	}

	/**
	 * 用户头像上传
	 * 
	 * @param userfile
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/do_upload", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo do_upload(MultipartFile userfile, HttpServletRequest request) throws Exception {
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		if (userfile == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请传入图片!");
			return amsuVo;
		}
		String userid = JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid");
		// String userid = "13522731203";
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		List<Userinfo> list = userinfoService.selectByExample(example);
		// 如果数据库中有该号码,说明该号码的信息已经填写完毕,所以是修改
		if (list != null && list.size() == 1) {
			// 原始文件名称: 得到XXX.jpg类似这样的
			String oldName = userfile.getOriginalFilename();
			// 创建一个新的名字(防止重名覆盖)
			String str1 = UUID.randomUUID().toString();
			String str2 = oldName.substring(oldName.lastIndexOf("."));
			String newName = str1 + str2;
			
			//设置相对路径  放到Tomcat里面 
	        String realPath = request.getSession().getServletContext().getRealPath("/usericons");
			// 上传图片
			File files = new File(realPath);
			// 如果该路径不存在就创建一个
			if (!files.exists()) {
				files.mkdirs();
			}
			// 将前端的传来的文件的二进制流写入指定文件中
			File file = new File(files + "\\" + newName);
			userfile.transferTo(file);
			
			
			Userinfo userinfo = list.get(0);
			userinfo.setIcon("usericons/" + newName);    
			userinfo.setUpdatetime(new Date());
			userinfoService.updateByPrimaryKeySelective(userinfo);
			String ip = request.getRemoteAddr();
			
			
			amsuVo.setRet("0");
			amsuVo.setErrDesc("http://" + ip + "/intellingence-web/usericons/" + newName);
//			System.out.println("http://" + ip + "/usericons/" + newName);
		} else {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先完善资料");
		}
		return amsuVo;
	}

	/** 
	 * 下载个人信息
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/readUserinfo", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo readUserinfo(HttpServletRequest request) {
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		String userid = JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid");
		// String userid = "13522731203";
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		List<Userinfo> list = userinfoService.selectByExample(example);
		// 如果数据库中有该号码,说明该号码的信息已经填写完毕,所以是修改
		if (list != null && list.size() == 1) {
			amsuVo.setRet("0");
			amsuVo.setErrDesc(list.get(0));
			String jstr = JSON.toJSONString(list.get(0));
			// System.out.println(jstr);
		} else {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先完善资料");
		}
		return amsuVo  ;
	}

	/**
	 * 新建紧急联系人
	 * 
	 * @param request
	 * @param name
	 * @param phone
	 * @return
	 */
	@RequestMapping(value = "/addContacts", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo addContacts(HttpServletRequest request, String name, String phone) {
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		String userid = JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid");
		// 测试
//		String userid = "13522731203";
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria(); 
		criteria.andUseridEqualTo(userid);
		List<Userinfo> list = userinfoService.selectByExample(example);
		// 如果数据库中有该号码,说明有该用户.进行添加联系人操作
		if (list != null && list.size() == 1) {
			// 填写联系人信息
			Contacts contact = new Contacts();
			contact.setName(name);
			contact.setPhone(phone);
			// 该联系人的外键userid对应的是userinfo的id.
			contact.setUserid(list.get(0).getId()); 
			contactsService.insert(contact);
			amsuVo.setRet("0");
			amsuVo.setErrDesc(contact.getId());
			// System.out.println(amsuVo);
		} else {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先完善资料");
		}
		return amsuVo;
	}
	
	/**
	 * 删除紧急联系人  
	 * @param request 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/deleteContact", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo deleteContact(HttpServletRequest request,String id){
		AmsuVo amsuVo = new AmsuVo();
		if(id==null||id.equals("")){
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("参数不正确!");
			return amsuVo;
		}
		int parseInt = -1;
		try{
			parseInt = Integer.parseInt(id);
		}catch(Exception e){
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("参数不正确!");
			return amsuVo;
		}
		
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid") == null) {
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		String userid = JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid");
		// 测试
//		String userid = "13522731203";
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria(); 
		criteria.andUseridEqualTo(userid);
		List<Userinfo> list = userinfoService.selectByExample(example);
		// 如果数据库中有该号码,说明有该用户.进行添加联系人操作
		if (list != null && list.size() == 1) {
			contactsService.deleteByPrimaryKey(parseInt);
			amsuVo.setRet("0"); 
			amsuVo.setErrDesc("操作成功!");
		}else{
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("无此用户!");
		}
		return amsuVo;
	}
	
	/**
	 * 修改联系人  
	 * @param request
	 * @param id
	 * @param phone
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/updateContacts", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo updateContacts(HttpServletRequest request,String id,String phone,String name){
		AmsuVo amsuVo = new AmsuVo();
		//校验参数
		if(id==null || id.equals("") || phone==null || phone.equals("") || name==null || name.equals("")){
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("参数传递不正确!");
			return amsuVo;
		}
		if(!CheckDatas.checkMobileNO(phone)){
			amsuVo.setRet("-20003");
			amsuVo.setErrDesc("手机号格式不正确!");
			return amsuVo;
		}
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		int parseInt = -1;
		try{
			parseInt = Integer.parseInt(id);
		}catch(Exception e){
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("参数不正确!");
			return amsuVo;
		}
		String userid = JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid");
		// 测试
//		String userid = "13522731203";
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria(); 
		criteria.andUseridEqualTo(userid);
		List<Userinfo> list = userinfoService.selectByExample(example);
		// 如果数据库中有该号码,说明有该用户.进行添加联系人操作
		if (list != null && list.size() == 1) {
			Contacts record = new Contacts();
			record.setId(parseInt);
			record.setName(name);
			record.setPhone(phone);
			int i = contactsService.updateByPrimaryKeySelective(record);
			if(i==1){
				amsuVo.setRet("0");  
				amsuVo.setErrDesc("操作成功!");
			}else{
				amsuVo.setRet("-20001"); 
				amsuVo.setErrDesc("无此联系人!");
			}
		}else{
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("无此用户!");
		}
		return amsuVo;
	}
	
	/**
	 * 设置求助信息SOS   
	 * @param request
	 * @param message
	 * @return
	 */
	@RequestMapping(value = "/setMessage", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo setMessage(HttpServletRequest request,String message){
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid") == null) {
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		if(message==null | message.equals("")){
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("参数错误!");
			return amsuVo;
		}
		String userid = JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid");
		// 测试
//		String userid = "13522731203";
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria(); 
		criteria.andUseridEqualTo(userid);   
		List<Userinfo> list = userinfoService.selectByExample(example);
		// 如果数据库中有该号码,说明有该用户.进行添加联系人操作
		if (list != null && list.size() == 1) {
			Userinfo userinfo = list.get(0);
			userinfo.setMessage(message);
			userinfoService.updateByPrimaryKeySelective(userinfo);
			amsuVo.setRet("0"); 
			amsuVo.setErrDesc("操作成功!");
		}else{
			amsuVo.setRet("-200001"); 
			amsuVo.setErrDesc("无此用户!");
		}
		return amsuVo;
	}
	  
	/** 
	 * 获得紧急联系人和求助信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getContactsAndMessage", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo getContactsAndMessage(HttpServletRequest request){
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid") == null) {
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		String userid = JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid");
		// 测试
//		String userid = "13522731203";  
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria(); 
		criteria.andUseridEqualTo(userid);
		List<Userinfo> list = userinfoService.selectByExample(example);
		// 如果数据库中有该号码,说明有该用户.进行添加联系人操作
		if (list != null && list.size() == 1) {
			ContactsQuery contactsQuery = new ContactsQuery();
			com.intellingence.pojo.ContactsQuery.Criteria createCriteria = contactsQuery.createCriteria();
			createCriteria.andUseridEqualTo(list.get(0).getId());
			List<Contacts> contactsList = contactsService.selectByExample(contactsQuery);
			Map<String,Object> dataMap = new HashMap<String,Object>();
			dataMap.put("contacts", contactsList);
			dataMap.put("message", list.get(0).getMessage());
			amsuVo.setRet("0"); 
			amsuVo.setErrDesc(dataMap);
		}else{
			amsuVo.setRet("-200001"); 
			amsuVo.setErrDesc("无此用户!");
		}
		return amsuVo;
	}
}