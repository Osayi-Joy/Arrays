package org.example;

import java.util.Arrays;

public class ReversedArray {
    public static int findMin(int [] array){
        int min = Integer.MAX_VALUE;
        for(int element: array){
            if(element < min){
                min = element;
            }

        }
        return min;
    }

    public static void reversed(int [] array){
        int maxIndex = array.length - 1;
        int halfIndex = maxIndex/2;

        for(int i = 0; i < halfIndex; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("-->" + Arrays.toString(array));
        }
    }

    public static int[] reversedCopy(int [] array){
        int [] reversedArray = new int[array.length];
        int maxIndex = array.length-1;
        for(int element: array){
            reversedArray[maxIndex--] = element;
        }
        return reversedArray;
    }

}
