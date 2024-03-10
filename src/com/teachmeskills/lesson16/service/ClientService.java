package com.teachmeskills.lesson16.service;

import com.teachmeskills.lesson16.model.Client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class ClientService {
    public static void showKeyValueMap(Map<Long, Client> map) {
        for (Map.Entry<Long, Client> e : map.entrySet()) {
            System.out.println("Key = " + e.getKey() + " -> Value = " + e.getValue());
        }
    }

    public static void showKeyValueIterator(Map<Long, Client> map) {
        Iterator<Map.Entry<Long, Client>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Long, Client> entry = iterator.next();
            String key = String.valueOf(entry.getKey());
            Client value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    public static void showsKeys(Map<Long, Client> map) {
        System.out.println(map.keySet());
    }

    public static void showValues(Map<Long, Client> map) {
        System.out.println(map.values());
    }
}
