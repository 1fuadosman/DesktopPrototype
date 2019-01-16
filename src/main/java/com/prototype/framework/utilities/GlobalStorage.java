package com.prototype.framework.utilities;

import com.prototype.framework.config.Settings;

import java.util.HashMap;
import java.util.Objects;

/*
- The purpose of this class is to provide the framework with capability to store data globally and fetch it anywhere for whatever purpose
 */

public class GlobalStorage {

    private static HashMap<String, String> hash_map = new HashMap<>();

    public static void store(String k, String v) {
        if(Objects.nonNull(k) && Objects.nonNull(v)){
            hash_map.put(k,v);
        }else
            Settings.Logs.Write("Invalid key/value pair. Both key and value need to be a string.");
    }

    public static String fetch(String k) {
        if(Objects.nonNull(k) && hash_map.containsKey(k)) {
            return  hash_map.get(k);
        }
        Settings.Logs.Write("Invalid key. The key needs to be a String and contained in the list.");
        return "Invalid key";
    }
}

