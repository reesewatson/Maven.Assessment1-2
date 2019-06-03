package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                count++;
            }
        } return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int count = getNumberOfOccurrences(objectArray, objectToRemove);
        int newLength = objectArray.length - count;
        Object[] remVal = Arrays.copyOf(objectArray, newLength);
        int n = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (!(objectArray[i].equals(objectToRemove))) {
                remVal[n] = objectArray[i];
                n++;
            }
        } return remVal;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommon = objectArray[0];
        int mostCounter = getNumberOfOccurrences(objectArray, mostCommon);
        for (int i = 0; i < objectArray.length; i++) {
            Object current = objectArray[i];
            int currentCounter = getNumberOfOccurrences(objectArray, current);
            if (mostCounter < currentCounter) {
                mostCommon = current;
                mostCounter = currentCounter;
            }
        } return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occurring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommon = objectArray[0];
        int leastCounter = getNumberOfOccurrences(objectArray, leastCommon);
        for (int i = 0; i < objectArray.length; i++) {
            Object current = objectArray[i];
            int currentCounter = getNumberOfOccurrences(objectArray, current);
            if (leastCounter > currentCounter) {
                leastCommon = current;
                leastCounter = currentCounter;
            }
        } return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int newLength = objectArray.length + objectArrayToAdd.length;
        Object[] merged = Arrays.copyOf(objectArray, newLength);
        int mergedIndex = objectArray.length;
        for (int i = 0; i < objectArrayToAdd.length; i++) {
            merged[mergedIndex] = objectArrayToAdd[i];
            mergedIndex++;
        } return merged;
    }
}
