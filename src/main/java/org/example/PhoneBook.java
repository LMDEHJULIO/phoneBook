package org.example;

import java.util.*;
import java.util.stream.Stream;

/**
 * @description Phonebook class that maps a name to phoneNumbers
 */

public class PhoneBook {

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

        PBUtility.validateInput(name, phoneNumber);

        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);

        return true;
    }



    /**
     * addAll - adds many phone numbers to a single name entry
     * @params String name, List<String> of phoneNumbers to be added to entry
     * @return boolean - confirmation that the operation was successful
     */

    public boolean addAll(String name, List<String> phoneNumbers){

        PBUtility.validateInput(name, String.valueOf(phoneNumbers));

        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).addAll(phoneNumbers);

        return true;
    }

    /**
     * remove - removes an entry to the composite associated data type
     * @param name - Name key used to access & remove marching entry
     */

    public void remove(String name) {
        PBUtility.validateInput(name);

        phoneBook.remove(name);
    }

    /**
     * hasEntry - checks if entry exists within map
     * @param name - entry to be checked for existence
     * @return Boolean - confirmation if entry exits
     */

    public boolean hasEntry(String name){

        PBUtility.validateInput(name);

        return phoneBook.containsKey(name);
    }

    /**
     * lookUp - searches for an entry value by key
     * @params name - name entry representing a person in the phonebook
     * @return List<String> - List of all possible phone numbers for a given person
     */

    public List<String> lookup(String name){
        PBUtility.validateInput(name);

        return phoneBook.get(name);
    }

    /**
     * reverseLookUp - Searches for an entry key by its value
     * @param phoneNumber - phoneNumber value used to lookup eye in reverse
     * @return String - String of entry key if operation successful
     */

    public String reverseLookUp(String phoneNumber){
        PBUtility.validateInput(phoneNumber);


                //Get entries from phonebook
        return   phoneBook.entrySet()
                //Make a stream from entries
                .stream()
                //filter out the entry contains the phonenumber
                .filter(entry -> entry.getValue().contains(phoneNumber))
                // get the first instance - there should only be one
                .findFirst()
                // get the entry from filtered list
                .get()
                // get the key
                .getKey()
                // convert key to string & return it
                .toString();
    }

    /**
     * getAllContactNames
     * @params null
     * @return String - String representing all contact names
     */

    public String getAllContactNames(){
        StringBuilder sb = new StringBuilder("");

        phoneBook.keySet().forEach(key -> sb.append(key + ", "));

        return sb.toString();
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
