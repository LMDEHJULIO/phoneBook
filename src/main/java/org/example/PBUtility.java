package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PBUtility {

    // More general/flexible null checker. Takes object type and dynamic error message as args
    public static <T> T checkIfNull(T object, String errorMessage){
        if(object == null){
            throw new IllegalArgumentException(errorMessage);
        }

        return object;
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Remove all () or -
        phoneNumber.replaceAll("[\\s()-]", "");
        // Checking if the phone number has exactly 10 digits.
        return phoneNumber != null && phoneNumber.matches("\\d{10}");
    }

    public static <T> boolean hasDuplicates(List<T> list) {
        Set<T> set = new HashSet<>(list);

        if(set.size() < list.size()){
            throw new IllegalArgumentException("Duplicate phone numbers in list");
        }

        return set.size() < list.size();
    }


    // Bundled validation to avoid loading PhoneBook with list of validation method calls

    public static void validateInput(String name, String... phoneNumbers) {
        checkIfNull(name, "Name is null");

        hasDuplicates(Arrays.asList((phoneNumbers)));

        for (String num : phoneNumbers) {
            checkIfNull(num, "Phone number is null");
            isValidPhoneNumber(num);
        }

    }

}
