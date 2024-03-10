package com.teachmeskills.lesson16.fabric;

import com.teachmeskills.lesson16.model.Client;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ClientFabric {
    public static Map<Long, Client> createClient(){
        Client cl1 = new Client("ALex", 18, new Date(), 111_222_333);
        Client cl2 = new Client("Sasha", 21, new Date(),222_222_222);
        Client cl3 = new Client("Kirill", 24, new Date(), 333_333_333);

        Map<Long, Client> clients = new HashMap<>();
        clients.put(cl1.getClientPassportNumber(), cl1);
        clients.put(cl2.getClientPassportNumber(), cl2);
        clients.put(cl3.getClientPassportNumber(), cl3);
        return clients;
    }
}
