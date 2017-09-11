package com.intellingence.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TranscodingUtils {
	public static File base64ToFile(String base64, String fileName) {
		File file = null;
		FileOutputStream out = null;
		try {
			file = new File(fileName);
			if (!file.exists()) { // 文件夹
				file.createNewFile();
			}
			// byte[] bytes = new BASE64Decoder().decodeBuffer(base64);
			byte[] bytes = decode(base64);
			ByteArrayInputStream in = new ByteArrayInputStream(bytes);
			byte[] buffer = new byte[1024];
			out = new FileOutputStream(file);
			int bytesum = 0;
			int byteread = 0;
			while ((byteread = in.read(buffer)) != -1) {
				bytesum += byteread;
				out.write(buffer, 0, byteread); // 文件写操作
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return file;
	}

	   /**  
	    * 解码  
	    * @param str  
	    * @return string  
	    */    
	   public static byte[] decode(String str){    
	   byte[] bt = null;    
	   try {    
	       sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();    
	       bt = decoder.decodeBuffer( str );    
	   } catch (IOException e) {    
	       e.printStackTrace();    
	   }    
	   
	       return bt;    
	   } 
}
