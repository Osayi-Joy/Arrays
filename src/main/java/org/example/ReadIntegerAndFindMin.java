package org.example;

import java.util.Scanner;

public class ReadIntegerAndFindMin {
    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integer seperated by commas: ");
        String input = scanner.nextLine();
        String [] splitedValues = input.split(",");
        int [] values = new int[splitedValues.length];

        for(int i = 0; i < splitedValues.length; i++ ){
            values[i] = Integer.parseInt(splitedValues[i].trim());
        }
        return values;
    }


    public static int findMin(int [] array){
        int min = Integer.MAX_VALUE;
        for(int element: array){
            if(element < min){
                min = element;
            }

        }
        return min;
    }
}
