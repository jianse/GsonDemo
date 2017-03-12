package com.company.Utils;

import com.company.Bean.SongDetail;
import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * Created by Lee on 2017/3/12.
 */
public class JsonHandler {
    public static String streamToString(InputStream is) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            baos.close();
            is.close();
            byte[] byteArray = baos.toByteArray();
            return new String(byteArray);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static SongDetail parseJsonByGson(String jsonStr)
    {
        Gson gson = new Gson();
        SongDetail songDetail = gson.fromJson(jsonStr,SongDetail.class);
        return songDetail;
    }
}
