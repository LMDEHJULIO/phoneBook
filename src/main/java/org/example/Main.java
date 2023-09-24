package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
//    public static void(String input){
//
//    }
    public static void main(String[] args) {

        PhoneBook phoneBook1 = new PhoneBook();

        phoneBook1.add("Julio Rodriguez", "215-090-0000");

        System.out.println(phoneBook1.lookup("Julio Rodriguez"));
        System.out.println(phoneBook1.reverseLookUp("215-090-0000"));

        phoneBook1.add("JRod", "215-090-3333");

        System.out.println(phoneBook1.reverseLookUp("215-090-3333"));
        System.out.println(phoneBook1.getAllContactNames());
    }
}