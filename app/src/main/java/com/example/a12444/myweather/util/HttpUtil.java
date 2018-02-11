package com.example.a12444.myweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 12444 on 2018/2/8.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
