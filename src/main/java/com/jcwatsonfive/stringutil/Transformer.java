package com.jcwatsonfive.stringutil;

import java.util.Arrays;

public class Transformer {

    public static final String EMPTY = "";

    public static String cleanNonAlphaNumeric(String value){
        if(Validator.empty(value))
            return value;

        return value.replaceAll("[^a-zA-Z0-9]", EMPTY);
    }

    public static String urlFriendly(String value){
        if(Validator.empty(value))
            return value;

        String cleaned = trimToEmpty(value);
        cleaned = cleaned.replaceAll(" ", "-");
        cleaned = cleaned.replaceAll("[^a-zA-Z0-9-]", EMPTY);
        return cleaned;
    }

    public static String trimToEmpty(String value){
        return value == null ? EMPTY : value.trim();
    }

    public static String removeDuplicates(String s){
        int bitVector = 0;
        int index = 0;
        char[] returnArray = new char[s.length()];

        for(int i = 0; i< s.length(); ++i){
            char currentChar = s.charAt(i);
            int value = currentChar - 'a';
            if((bitVector & (1 << value)) == 0){
                bitVector |= (1 << value);
                returnArray[index] = currentChar;
                index++;
            }
        }
        return new String(Arrays.copyOf(returnArray,index));
    }

    public static String join(String[] array, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }

    public static String multiply(String s, int i) {
        StringBuilder sb = new StringBuilder();
        while(i > 0){
            sb.append(s);
            i--;
        }
        return sb.toString();
    }

    public static boolean isCapital(char c){
        return (c >= 'A' && c <= 'Z');
    }

    public static int secondLargest(int[] values) {
        int largest = values[0];
        int secondLargest = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] >= largest) {
                secondLargest = largest;
                largest = values[i];
            }
            if (values[i] >= secondLargest && values[i] < largest) {
                secondLargest = values[i];
            }
        }

        return secondLargest;
    }
}
