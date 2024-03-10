package com.teachmeskills.lesson16.run;

import com.teachmeskills.lesson16.fabric.ClientFabric;
import com.teachmeskills.lesson16.model.Client;
import com.teachmeskills.lesson16.service.ClientService;

import java.util.Map;


public class Runner {
    public static void main(String[] args) {
        Map<Long, Client> clientList = ClientFabric.createClient();
        System.out.println("\n \\ Все пары ключ-значение, использую Map.Entry<K, V> entry : map.entrySet() \\");
        ClientService.showKeyValueMap(clientList);
        System.out.println("\n \\ Все пары ключ-значение, использую итератор \\");
        ClientService.showKeyValueIterator(clientList);
        System.out.println("\n \\ Все ключи, используя map.keySet() \\");
        ClientService.showsKeys(clientList);
        System.out.println("\n \\ Все значения, используя map.values() \\");
        ClientService.showValues(clientList);

    }
}
