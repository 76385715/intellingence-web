package com.intellingence.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.Header;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.multipart.MultipartFile;

public class HttpRequestUtils {
	/**
	 * 向指定URL发送GET方法的请求
	 * 
	 * @param url
	 *            发送请求的URL
	 * @param param
	 *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return URL 所代表远程资源的响应结果
	 */
	public static String sendGet(String url, String param) {
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url + "?" + param;
			URL realUrl = new URL(urlNameString);
			// 打开和URL之间的连接
			URLConnection connection = realUrl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 建立实际的连接
			connection.connect();
			// 获取所有响应头字段
			Map<String, List<String>> map = connection.getHeaderFields();
			// 遍历所有的响应头字段
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
			// 定义 BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送GET请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	/*
	 * get请求,另外一个参数是可以设置一个请求头
	 */
	public static String sendGetWithHeader(String url, String param, String authorization) {
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url + "?" + param;
			URL realUrl = new URL(urlNameString);
			// 打开和URL之间的连接
			URLConnection connection = realUrl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("Authorization", authorization);
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 建立实际的连接
			connection.connect();
			// 获取所有响应头字段
			Map<String, List<String>> map = connection.getHeaderFields();
			// 遍历所有的响应头字段
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
			// 定义 BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送GET请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	/*
	 * get请求,另外一个参数是可以设置一个请求头
	 */
	public static String sendGetWithHeaderWithoutParam(String url, String authorization) {
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url;
			URL realUrl = new URL(urlNameString);
			// 打开和URL之间的连接
			URLConnection connection = realUrl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("Authorization", authorization);
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 建立实际的连接
			connection.connect();
			// 获取所有响应头字段
			Map<String, List<String>> map = connection.getHeaderFields();
			// 遍历所有的响应头字段
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
			// 定义 BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送GET请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 向指定 URL 发送POST方法的请求
	 * 
	 * @param url
	 *            发送请求的 URL
	 * @param param
	 *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return 所代表远程资源的响应结果
	 * @throws Exception
	 */
	public static String sendPost(String url, String param) throws Exception {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(param);

			// flush输出流的缓冲.
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			// System.out.println("发送 POST 请求出现异常！" + e);
			// e.printStackTrace();
			throw e;
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	public static String sendPostAndSetHeader(String url, String param, String authorization) throws Exception {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("Authorization", authorization);
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(param);

			// flush输出流的缓冲.
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			// System.out.println("发送 POST 请求出现异常！" + e);
			// e.printStackTrace();
			throw e;
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	// // 模拟客户端请求
	//
	// public static void main(String[] args) {
	// TestBean tb = new TestBean("liyangyang", "25");
	// Gson gson = new Gson();
	// // 传入的参数
	// String datas = gson.toJson(tb);
	// String url =
	// "http://localhost:8080/ziDingYiTest/index/home.htm?type=ajaxRequest";
	// String data = sendPostRequest(url, datas);
	// // 请求回来的数据
	// System.out.println(data);
	// }

	public static String sendPostRequest(String url, String param) throws Exception {
		HttpURLConnection httpURLConnection = null;
		OutputStream out = null; // 写
		InputStream in = null; // 读
		int responseCode = 0; // 远程主机响应的HTTP状态码
		String result = "";

		URL sendUrl = new URL(url);
		httpURLConnection = (HttpURLConnection) sendUrl.openConnection();
		// post方式请求
		httpURLConnection.setRequestMethod("POST");
		// 设置头部信息
		httpURLConnection.setRequestProperty("headerdata", "ceshiyongde");
		// 一定要设置 Content-Type 要不然服务端接收不到参数
		httpURLConnection.setRequestProperty("Content-Type", "application/Json; charset=UTF-8");
		// 指示应用程序要将数据写入URL连接,其值默认为false（是否传参）
		httpURLConnection.setDoOutput(true);
		// httpURLConnection.setDoInput(true);

		httpURLConnection.setUseCaches(false);
		httpURLConnection.setConnectTimeout(30000); // 30秒连接超时
		httpURLConnection.setReadTimeout(30000); // 30秒读取超时
		// 传入参数
		out = httpURLConnection.getOutputStream();
		out.write(param.getBytes());
		out.flush(); // 清空缓冲区,发送数据
		out.close();
		responseCode = httpURLConnection.getResponseCode();
		// 获取请求的资源
		BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
		result = br.readLine();

		return result;

	}

	public static String getShoepadDatas(String urls, File leftFile, File rightFile, String access_token,
			String creationTime, String type, String name, String gender, String age, String height, String weight,
			String phone, String tag, String leftChecksum, String rightChecksum) {
		String result = null;
		try {
			String boundary = "Boundary-b1ed-4060-99b9-fca7ff59c113"; // Could
																		// be
																		// any
																		// string
			String Enter = "\r\n";

			// File xml = new File("C:\\dog.xml");
			FileInputStream leftFis = new FileInputStream(leftFile);
			FileInputStream rifgFis = new FileInputStream(rightFile);

			URL url = new URL(urls);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setRequestMethod("POST");
			conn.setUseCaches(false);
			conn.setInstanceFollowRedirects(true);
			conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);

			conn.connect();

			DataOutputStream dos = new DataOutputStream(conn.getOutputStream());

			// part 1
			String part1 = "--" + boundary + Enter + "Content-Type: application/octet-stream" + Enter
					+ "Content-Disposition: form-data; filename=\"" + leftFile.getName() + "\"; name=\"left.file\""
					+ Enter + Enter;
			// part 3
			String part3 = "--" + boundary + Enter + "Content-Type: application/octet-stream" + Enter
					+ "Content-Disposition: form-data; filename=\"" + rightFile.getName() + "\"; name=\"right.file\""
					+ Enter + Enter;
			// // part 2
			// String part2 = Enter + "--" + boundary + Enter + "Content-Type:
			// text/plain" + Enter
			// + "Content-Disposition: form-data; name=\"access_token\"" + Enter
			// + Enter + access_token + Enter + "--"
			// + boundary + "--";
			// part 4
			String part4 = Enter + "--" + boundary + Enter + "Content-Type: text/plain" + Enter
					+ "Content-Disposition: form-data; name=\"creationTime\"" + Enter + Enter + creationTime + Enter
					+ "--" + boundary + "--";
			// part 5
			String part5 = Enter + "--" + boundary + Enter + "Content-Type: text/plain" + Enter
					+ "Content-Disposition: form-data; name=\"type\"" + Enter + Enter + type + Enter + "--" + boundary
					+ "--";
			// part 6
			String part6 = Enter + "--" + boundary + Enter + "Content-Type: text/plain" + Enter
					+ "Content-Disposition: form-data; name=\"name\"" + Enter + Enter + name + Enter + "--" + boundary
					+ "--";
			// part 7
			String part7 = Enter + "--" + boundary + Enter + "Content-Type: text/plain" + Enter
					+ "Content-Disposition: form-data; name=\"gender\"" + Enter + Enter + gender + Enter + "--"
					+ boundary + "--";
			// part 8
			String part8 = Enter + "--" + boundary + Enter + "Content-Type: text/plain" + Enter
					+ "Content-Disposition: form-data; name=\"age\"" + Enter + Enter + age + Enter + "--" + boundary
					+ "--";
			// part 9
			String part9 = Enter + "--" + boundary + Enter + "Content-Type: text/plain" + Enter
					+ "Content-Disposition: form-data; name=\"height\"" + Enter + Enter + height + Enter + "--"
					+ boundary + "--";
			// part 10
			String part10 = Enter + "--" + boundary + Enter + "Content-Type: text/plain" + Enter
					+ "Content-Disposition: form-data; name=\"weight\"" + Enter + Enter + weight + Enter + "--"
					+ boundary + "--";
			// part 11
			String part11 = Enter + "--" + boundary + Enter + "Content-Type: text/plain" + Enter
					+ "Content-Disposition: form-data; name=\"phone\"" + Enter + Enter + phone + Enter + "--" + boundary
					+ "--";
			// part 12
			String part12 = Enter + "--" + boundary + Enter + "Content-Type: text/plain" + Enter
					+ "Content-Disposition: form-data; name=\"left.checksum\"" + Enter + Enter + leftChecksum + Enter
					+ "--" + boundary + "--";
			// part 13
			String part13 = Enter + "--" + boundary + Enter + "Content-Type: text/plain" + Enter
					+ "Content-Disposition: form-data; name=\"right.checksum\"" + Enter + Enter + rightChecksum + Enter
					+ "--" + boundary + "--";

			byte[] leftBytes = new byte[leftFis.available()];
			byte[] rightBytes = new byte[rifgFis.available()];
			leftFis.read(leftBytes);
			rifgFis.read(rightBytes);

			dos.writeBytes(part1);
			dos.write(leftBytes);
			dos.write(rightBytes);
			// dos.writeBytes(part2);
			dos.writeBytes(part3);
			dos.writeBytes(part4);
			dos.writeBytes(part5);
			dos.writeBytes(part6);
			dos.writeBytes(part7);
			dos.writeBytes(part8);
			dos.writeBytes(part9);
			dos.writeBytes(part10);
			dos.writeBytes(part11);
			dos.writeBytes(part12);
			dos.writeBytes(part13);

			dos.flush();
			dos.close();
			leftFis.close();
			rifgFis.close();

			System.out.println("status code: " + conn.getResponseCode());

			BufferedReader in = null;

			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
			conn.disconnect();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 中转文件
	 * 
	 * @param file
	 *            上传的文件
	 * @return 响应结果
	 */
	public static String httpClientUploadFile(MultipartFile leftFile, MultipartFile rightFile, String creationTime,
			String type, String name, String gender, String age, String height, String weight, String phone, String tag,
			String leftchecksum, String rightchecksum, String authorization, String url) {
		// final String remote_url =
		// "http://192.168.1.99:8080/demo/file/upload";// 第三方服务器请求地址
		CloseableHttpClient httpClient = HttpClients.createDefault();
		String result = "";
		try {
			String fileNameLeft = leftFile.getOriginalFilename();
			String fileNameRight = rightFile.getOriginalFilename();
			HttpPost httpPost = new HttpPost(url);
			MultipartEntityBuilder builder = MultipartEntityBuilder.create();
			httpPost.setHeader("Authorization", authorization);
			httpPost.setHeader("accept", "*/*");
			httpPost.setHeader("connection", "Keep-Alive");
			// 添加参数
			builder.addBinaryBody("left.file", leftFile.getInputStream(), ContentType.MULTIPART_FORM_DATA,
					fileNameLeft);// 文件流
			builder.addBinaryBody("right.file", rightFile.getInputStream(), ContentType.MULTIPART_FORM_DATA,
					fileNameRight);// 文件流
			builder.addTextBody("creationTime", creationTime);// 类似浏览器表单提交，对应input的name和value
			builder.addTextBody("type", type);// 类似浏览器表单提交，对应input的name和value
			builder.addTextBody("name", name);// 类似浏览器表单提交，对应input的name和value
			builder.addTextBody("gender", gender);// 类似浏览器表单提交，对应input的name和value
			builder.addTextBody("age", age);// 类似浏览器表单提交，对应input的name和value
			builder.addTextBody("height", height);// 类似浏览器表单提交，对应input的name和value
			builder.addTextBody("weight", weight);// 类似浏览器表单提交，对应input的name和value
			builder.addTextBody("phone", phone);// 类似浏览器表单提交，对应input的name和value
			builder.addTextBody("tag", tag);// 类似浏览器表单提交，对应input的name和value
			builder.addTextBody("left.checksum", leftchecksum);// 类似浏览器表单提交，对应input的name和value
			builder.addTextBody("right.checksum", rightchecksum);// 类似浏览器表单提交，对应input的name和value
			// builder.addTextBody("Authorization", authorization);//
			// 类似浏览器表单提交，对应input的name和value

			HttpEntity entity = builder.build();
			httpPost.setEntity(entity);
			HttpResponse response = httpClient.execute(httpPost);// 执行提交
			HttpEntity responseEntity = response.getEntity();
			if (responseEntity != null) {
				// 将响应内容转换为字符串
				result = EntityUtils.toString(responseEntity, Charset.forName("UTF-8"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	

	public void upload(File leftFile, File rightFile, String creationTime, String type, String name, String age,
			String height, String weight, String phone, String tag, String leftchecksum, String rightchecksum,
			String authorization, String url) {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		try {
			httpClient = HttpClients.createDefault();

			// 把一个普通参数和文件上传给下面这个地址 是一个servlet
			HttpPost httpPost = new HttpPost(url);
			httpPost.setHeader("Authorization", authorization);
			// 把文件转换成流对象FileBody
			FileBody bin1 = new FileBody(leftFile);
			FileBody bin2 = new FileBody(rightFile);

			StringBody ct = new StringBody(creationTime, ContentType.create("text/plain", Consts.UTF_8));
			StringBody tp = new StringBody(type, ContentType.create("text/plain", Consts.UTF_8));
			StringBody nm = new StringBody(name, ContentType.create("text/plain", Consts.UTF_8));
			StringBody ag = new StringBody(age, ContentType.create("text/plain", Consts.UTF_8));
			StringBody ht = new StringBody(height, ContentType.create("text/plain", Consts.UTF_8));
			StringBody wt = new StringBody(weight, ContentType.create("text/plain", Consts.UTF_8));
			StringBody ph = new StringBody(phone, ContentType.create("text/plain", Consts.UTF_8));
			StringBody tg = new StringBody(tag, ContentType.create("text/plain", Consts.UTF_8));
			StringBody lc = new StringBody(leftchecksum, ContentType.create("text/plain", Consts.UTF_8));
			StringBody rc = new StringBody(rightchecksum, ContentType.create("text/plain", Consts.UTF_8));

			HttpEntity reqEntity = MultipartEntityBuilder.create()
					// 相当于<input type="file" name="file"/>
					.addPart("file", bin1).addPart("file", bin2)

					// 相当于<input type="text" name="userName" value=userName>
					.addPart("creationTime", ct).addPart("type", tp).addPart("name", nm).addPart("age", ag)
					.addPart("height", ht).addPart("weight", wt).addPart("phone", ph).addPart("tag", tg)
					.addPart("leftchecksum", lc).addPart("rightchecksum", rc).build();

			httpPost.setEntity(reqEntity);

			// 发起请求 并返回请求的响应
			response = httpClient.execute(httpPost);

			System.out.println("The response value of token:" + response.getFirstHeader("token"));

			// 获取响应对象
			HttpEntity resEntity = response.getEntity();
			if (resEntity != null) {
				// 打印响应长度
				System.out.println("Response content length: " + resEntity.getContentLength());
				// 打印响应内容
				System.out.println(EntityUtils.toString(resEntity, Charset.forName("UTF-8")));
			}

			// 销毁
			EntityUtils.consume(resEntity);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (response != null) {
					response.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (httpClient != null) {
					httpClient.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}