package org.example;
import java.util.Arrays;

import static org.example.ReadIntegerAndFindMin.findMin;
import static org.example.ReadIntegerAndFindMin.readIntegers;
import static org.example.ReversedArray.reversed;
import static org.example.ReversedArray.reversedCopy;

public class Main {
    public static void main(String[] args) {
    int [] returnArray = readIntegers();
        System.out.println(Arrays.toString(returnArray));

//        int returnMin = findMin(returnArray);
//        System.out.println("Min: " + returnMin);

//        reversed(returnArray);
//        System.out.println("Final: " + Arrays.toString(returnArray));

        System.out.println("_".repeat(20));

        int [] reversedCopy = reversedCopy(returnArray);
        System.out.println("After Reversed" + Arrays.toString(returnArray));
        System.out.println("Before  Reverse" + Arrays.toString(reversedCopy));







    }





}