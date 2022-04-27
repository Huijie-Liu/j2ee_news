package com.jay.store.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NewsAPI {
    //java环境中文传值时，需特别注意字符编码问题
    String httpUrl;
    String httpArg;
    public String jsonResult;


    public NewsAPI() {
        httpUrl = "http://api.tianapi.com/world/index";
        httpArg = "key=e33ce39fe3d12ee6d59c30db341f44a1&num=10";
        jsonResult = request(httpUrl, httpArg);
        System.out.println(jsonResult);
    }

    /**
     * @param urlAll  请求接口
     * @param httpArg 参数
     * @return 返回结果
     */
    public static String request(String httpUrl, String httpArg) {
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        httpUrl = httpUrl + "?" + httpArg;
        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setRequestMethod("GET");
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sbf.append(strRead);
                sbf.append("\r\n");
            }
            reader.close();
            result = sbf.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
