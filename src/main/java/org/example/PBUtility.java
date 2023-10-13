package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PBUtility {

    /**
     * Checks if the given object is null and throws an IllegalArgumentException with the given errorMessage if so
     *
     * @param <T> the type of the object to be checked
     * @param object the object to be checked for null
     * @param errorMessage the error message to be used in the exception if the object is null
     * @return the object if it's not null
     * @throws IllegalArgumentException if the object is null
     */

    public static <T> T checkIfNull(T object, String errorMessage){
        if(object == null){
            throw new IllegalArgumentException(errorMessage);
        }

        return object;
    }

    /**
     * Validates if the given phoneNumber is a valid 10-digit number.
     *
     * @param phoneNumber the phone number to be validated
     * @return true if the phone number is valid, otherwise false
     */

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Remove all () or - chars
        phoneNumber.replaceAll("[\\s()-]", "");
        // Checking if the phone number has exactly 10 digits.
        return phoneNumber != null && phoneNumber.matches("\\d{10}");
    }

    /**
     * Checks if the given list has duplicate entries.
     *
     * @param <T> the type of elements in the list
     * @param list the list to be checked for duplicates
     * @return true if the list has duplicates, otherwise false
     * @throws IllegalArgumentException if the list has duplicates
     */

    public static <T> boolean hasDuplicates(List<T> list) {
        Set<T> set = new HashSet<>(list);

        if(set.size() < list.size()){
            throw new IllegalArgumentException("Duplicate phone numbers in list");
        }

        return set.size() < list.size();
    }


    // Bundled validation to avoid loading PhoneBook with list of validation method calls

    /**
     * Validates the given name and phoneNumbers. Checks for null values, duplicates, and the validity of phone numbers.
     *
     * @param name the name to be validated
     * @param phoneNumbers the phone numbers to be validated - spread as Array for variable length
     * @throws IllegalArgumentException if any validation fails
     */

    public static void validateInput(String name, String... phoneNumbers) {
        checkIfNull(name, "Name is null");
        hasDuplicates(Arrays.asList((phoneNumbers)));

        for (String num : phoneNumbers) {
            checkIfNull(num, "Phone number is null");
            isValidPhoneNumber(num);
        }

    }

}
