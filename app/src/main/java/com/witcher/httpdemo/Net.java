package com.witcher.httpdemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Zou Sheng on 2016/4/16.
 */
public class Net {
    public static InputStream get(String url) {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setReadTimeout(8000);
            connection.setConnectTimeout(8000);
            return connection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
            if (connection != null) {
                connection.disconnect();
            }
            return null;
        }
    }
}
