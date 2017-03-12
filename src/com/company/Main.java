package com.company;

import com.company.Bean.SongDetail;
import com.company.Utils.JsonHandler;
import com.google.gson.Gson;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) {
	// write your code here



        String res = new String();

        try{
            URL url = new URL("https://c.y.qq.com/v8/fcg-bin/fcg_play_single_song.fcg?songmid=000LBcVm0d9raf&tpl=yqq_song_detail&format=jsonp&callback=Callback&g_tk=0&jsonpCallback=getOneSongInfoCallback&loginUin=1484190946&hostUin=0&format=jsonp&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0");

            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.setConnectTimeout(5*1000);

            urlConnection.setReadTimeout(5*1000);

            urlConnection.setUseCaches(true);

            urlConnection.setRequestMethod("GET");

            urlConnection.connect();

            if(urlConnection.getResponseCode() == 200){
                res = JsonHandler.streamToString(urlConnection.getInputStream());
                res = res.substring(9,res.length()-1);
                System.out.println(res);
            }
            else
                res = null;
        urlConnection.disconnect();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("开始转换");
        Gson gson = new Gson();

        SongDetail songDetail = gson.fromJson(res,SongDetail.class);
        System.out.println(songDetail.toString());

        Map<String,String> data = songDetail.getUrl();

        for(String key:data.keySet()){
            System.out.println(key);
            System.out.println(data.get(key).toString());
        }
    }

}
