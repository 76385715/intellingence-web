package com.intellingence.controller;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.intellingence.entry.AmsuVo;
import com.intellingence.pojo.VersionWatchWithBLOBs;
import com.intellingence.pojo.VersionWithBLOBs;
import com.intellingence.service.VersionService;
import com.intellingence.service.WatchVersionService;
/**
 * 关于版本控制的controller
 * @author 梦里不知身是客
 *
 */
@Controller
public class VersionController {
	@Autowired
	private VersionService versionService;
	
	@Autowired
	private WatchVersionService watchVersionService;
	
	@Value("${FILE_UPLOAD_PATH}")
	private String FILE_UPLOAD_PATH;
	
	@Value("${WATCH_FILE_UPLOAD_PATH}")
	private String WATCH_FILE_UPLOAD_PATH;
	
	/**
	 * 上传衣服app
	 * @param file
	 * @param version
	 * @param request
	 * @param password
	 * @return
	 */
	@RequestMapping("/upLoadFile")
	@ResponseBody
    public AmsuVo upload(@RequestParam(value = "file", required = false) MultipartFile file, VersionWithBLOBs version , HttpServletRequest request,String password) {
		AmsuVo amsuVo = new AmsuVo();
		if(!password.equals("weimengwudidatangge")){
			amsuVo.setRet("-20001");
            amsuVo.setErrDesc("你没有上传权限");
            return amsuVo;
		}
		//设置相对路径
        String realPath = request.getSession().getServletContext().getRealPath("/upload");
        //获取文件的格式
        String extention = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
        	//对格式进行筛选
        if(extention.equalsIgnoreCase("apk") || extention.equalsIgnoreCase("txt") || extention.equalsIgnoreCase("png")) {
        	//在路径下创建文件夹
        	File f = new File(realPath);
            String fileName = file.getOriginalFilename();
            String uploadPath = realPath + File.separator + fileName;
            if(!f.exists()) {
                f.mkdir();
            }
            try {
            	//文件的传输
            	file.transferTo(new File(uploadPath));
            	version.setUpdatdate(new Date());
            	version.setVersiondatetime(new Date());
            	version.setPath(FILE_UPLOAD_PATH+fileName);
            	versionService.insertSelective(version);
            	amsuVo.setRet("0");
            	amsuVo.setErrDesc("文件上传成功");
			} catch (Exception e) {
				e.printStackTrace();
				amsuVo.setRet("-20001");
	            amsuVo.setErrDesc("文件上传失败");
			}
        } else {
        	amsuVo.setRet("-20001");
            amsuVo.setErrDesc("文件上传失败");
        }
        return amsuVo;
    }
	
	/**
	 * 上传手表app
	 * @param file
	 * @param version
	 * @param request
	 * @param password
	 * @return
	 */
	@RequestMapping("/uploadByWatch")
	@ResponseBody
    public AmsuVo uploadByWatch(@RequestParam(value = "file", required = false) MultipartFile file, VersionWatchWithBLOBs version , HttpServletRequest request,String password) {
		AmsuVo amsuVo = new AmsuVo();
		if(!password.equals("weimengwudidatangge")){
			amsuVo.setRet("-20001");
            amsuVo.setErrDesc("你没有上传权限");
            return amsuVo;
		}
		//设置相对路径
        String realPath = request.getSession().getServletContext().getRealPath("/upload_watch");
        //获取文件的格式
        String extention = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
        	//对格式进行筛选
        if(extention.equalsIgnoreCase("apk") || extention.equalsIgnoreCase("txt") || extention.equalsIgnoreCase("png")) {
        	//在路径下创建文件夹
        	File f = new File(realPath);
            String fileName = file.getOriginalFilename();
            String uploadPath = realPath + File.separator + fileName;
            if(!f.exists()) {
                f.mkdir();
            }
            try {
            	//文件的传输
            	file.transferTo(new File(uploadPath));
            	version.setUpdatdate(new Date());
            	version.setVersiondatetime(new Date());
            	version.setPath(WATCH_FILE_UPLOAD_PATH+fileName);
            	watchVersionService.insertSelective(version);
            	amsuVo.setRet("0");
            	amsuVo.setErrDesc("文件上传成功");
			} catch (Exception e) {
				e.printStackTrace();
				amsuVo.setRet("-20001");
	            amsuVo.setErrDesc("文件上传失败");
			}
        } else {
        	amsuVo.setRet("-20001"); 
            amsuVo.setErrDesc("文件上传失败");
        }
        return amsuVo;
    }
	
	/**
	 * 获取衣服app的版本号
	 * @return
	 */
	@RequestMapping("/getLastVersion")
	@ResponseBody
	public AmsuVo getLastVersion(){
		AmsuVo amsuVo = new AmsuVo();
		VersionWithBLOBs version = versionService.selectLastVersion();
		if(version!=null){
			amsuVo.setRet("0");
			amsuVo.setErrDesc(version);
		}else{
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("获取版本失败");
		} 
		return amsuVo;
	}
	
	/**
	 * 获取手表app的版本号
	 * @return
	 */
	@RequestMapping("/getLastWatchVersion")
	@ResponseBody
	public AmsuVo getLastWatchVersion(){
		AmsuVo amsuVo = new AmsuVo();
		VersionWatchWithBLOBs version = watchVersionService.selectLastVersion();
		if(version!=null){
			amsuVo.setRet("0");
			amsuVo.setErrDesc(version);
		}else{
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("获取版本失败");
		} 
		return amsuVo;
	}
}
