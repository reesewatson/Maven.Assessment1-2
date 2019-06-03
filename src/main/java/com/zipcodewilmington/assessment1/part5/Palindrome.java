package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;
import java.util.Set;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int count = 0;
        String subStr = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                subStr = input.substring(i, j);
                if (subStr.equalsIgnoreCase(BasicStringUtils.reverse(subStr))) {
                    count++;
                }
            }
        } return count;
    }

    public boolean isPalindromic(String input){
        if (input.equalsIgnoreCase(BasicStringUtils.reverse(input))) {
            return true;
        } return false;
    }
}

