package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input){
        int count = 0;
        String[] strArr = input.split(" ");
        for (String word : strArr) {
            if (isPalindromic(word) == true) {
                count++;
            }
        } return count;
    }

    public boolean isPalindromic(String input){
        if (input.equalsIgnoreCase(BasicStringUtils.reverse(input))) {
            return true;
        } return false;
    }
}
