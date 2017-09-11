package com.intellingence.entry;

import java.io.File;
import java.util.Date;

public class JobWork {
	public void clearQRCode() {
		System.out.println("定时器执行了" + new Date());
//		File file = new File("F:\\code\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\intellingence-web\\QRCode");
		File file = new File("/usr/local/tomcat/apache-tomcat-7.0.52/webapps/intellingence-web/QRCode");
		deleteAll(file);
	}

	public static void deleteAll(File file) {

		if (file.isFile() || file.list().length == 0) {
			file.delete();
		} else {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				deleteAll(files[i]);
				files[i].delete();
			}

			if (file.exists()) // 如果文件本身就是目录 ，就要删除目录
				file.delete();
		}
	}
}