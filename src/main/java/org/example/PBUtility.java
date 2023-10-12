package org.example;

public class PBUtility {
    public static void isNull(String input){
        String errorMsg = input == null ? input + "is null" : null;

        if(errorMsg !=null) {
            throw new IllegalArgumentException(errorMsg);
        }
    }

//    public static void()
}
