package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * reverseLookUp
     * remove - removes an entry to the composite associated data type
     * @description Phonbook class that maps a name to phoneNumbers
     */

    /**
     * getAllContactNames
     * @params
     * @return
     * remove - removes an entry to the composite associated data type
     * @description Phonbook class that maps a name to phoneNumbers
     */





}
