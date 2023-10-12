package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook1 = new PhoneBook();

        phoneBook1.add("Julio Rodriguez", "215-090-0000");

        System.out.println(phoneBook1.lookup("Julio Rodriguez"));
        System.out.println(phoneBook1.reverseLookUp("215-090-0000"));

        phoneBook1.add("JRod", "215-090-3333");

        System.out.println(phoneBook1.reverseLookUp("215-090-3333"));

        System.out.println(phoneBook1.getAllContactNames());

        phoneBook1.remove("JRod");

        System.out.println(phoneBook1.getAllContactNames());

        phoneBook1.addAll("Julio Rodriguez", List.of("215-839-1232", "212-343-2345", "856-654-2345"));

        System.out.println(phoneBook1);

        System.out.println(phoneBook1.hasEntry("Julio Rodriguez"));

        System.out.println(phoneBook1.hasEntry("JRod"));

        phoneBook1.add("Chocolate Factory", "234-232-2344");
    }
}