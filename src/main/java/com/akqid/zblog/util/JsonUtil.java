package com.akqid.zblog.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

public class JsonUtil {
    private static final Gson gson = (new GsonBuilder()).disableHtmlEscaping().create();

    public JsonUtil() {
    }

    public static String toJson(Object object) {
        return gson.toJson(object);
    }

    public static <T> T toObject(String json, Class<T> t) {
        try {
            return gson.fromJson(json, t);
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static <T> T toObject(String json, Type type) {
        return gson.fromJson(json, type);
    }
}
