package org.example;

import java.util.*;

/**
 * @description Phonebook class that maps a name to phoneNumbers
 */

public class PhoneBook {

    //
//     initalize private array/arrayList of names
//    initialize private array/arrayList of phoneNumbers


    // initialize Map<Person, PhoneNumber> or
    // Map<String, List<String>

    private Map<String, List<String>> phoneBook;

    public PhoneBook(){
        this.phoneBook = new HashMap<>();
    }

    /**
     * add() - adds many phone nuumber to a single name entry
     * @params int phoneNumber - to be added to
     * @return boolean - boolean representing sucess/failure of the operation
     */

    public boolean add(String name, String phoneNumber){
        if(!phoneBook.containsKey(name)){
            phoneBook.put(name, new ArrayList<>());
        }

        phoneBook.get(name).add(phoneNumber);

        return true;
    }



    /**
     * addAll - adds many phone numbers to a single name entry
     * @params - phoneNumbers to be added to
     * @description Phonbook class that maps a name to phoneNumbers
     */

    // For each phoneNumber - put phoneNumber as value @ Person Key
    // probably establish some error checking code to ensure phone has all digits, is not null, etc
    // if so, put to key

    public boolean addAll(String name, List<String> phoneNumber){
        phoneBook.get(name).addAll(phoneNumber);

        return true;
    }

    /**
     * remove - removes an entry to the composite associated data type
     * @param key that is set to have its value removed
     * @description Phonbook class that maps a name to phoneNumbers
     */

    //Map.remove at the given key

    public void remove(String name) {
        phoneBook.remove(name);
    }

    /**
     * hasEntry - checks if entry exists within map
     * @param String name - entry to be checked for existence
     * @return Boolean - confirmation if entry exits
     */

    public boolean hasEntry(String name){
        return phoneBook.containsKey(name);
    }

    /**
     * lookUp
     * remove - removes an entry to the composite associated data type
     * @description Phonbook class that maps a name to phoneNumbers
     */

    public List<String> lookup(String name){
        return phoneBook.get(name);
    }

    /**
     * reverseLookUp
     * remove - removes an entry to the composite associated data type
     * @description Phonbook class that maps a name to phoneNumbers
     */

    // for every entry in the map - find how to express this
    public String reverseLookUp(String phoneNumber){
//        for(Map.Entry<String, List<String>> entry : phoneBook.entrySet()){
//            List<String> phoneNumbers = entry.getValue();
//
//            if(phoneNumbers.contains(phoneNumber)){
//                return entry.getKey();
//            }
//        }

        return phoneBook.entrySet().
                stream()
                .filter(entry -> entry.getValue().contains(phoneNumber))
                .findFirst()
                .get()
                .getKey()
                .toString();
    }

    /**
     * getAllContactNames
     * @params
     * @return
     * remove - removes an entry to the composite associated data type
     * @description Phonbook class that maps a name to phoneNumbers
     */

    public String getAllContactNames(){
        StringBuilder sb = new StringBuilder("");

        Set<String> keys = phoneBook.keySet();

        for(String key : keys){
            sb.append(", ").append(key);
        }

        return sb.toString();
    }





}
