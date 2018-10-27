//author: Daniel Paulino

import java.util.Arrays;
import java.util.Scanner;

public class Keys {
    private static int[] numbers = new int[5];
    private static int[] allNumbers = new int[50];
    private static Scanner input = new Scanner(System.in);




    public static void main(String[] args) {
        euroKeys();
    }

    private static void euroKeys() {

        System.out.println("How many keys ?");
        int numberOfKeys = input.nextInt();

        for (int j = 0; j < numberOfKeys; j++) {

            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Insert the 5 numbers (from 1-50) of the key");
                numbers[i] = input.nextInt();
            }

            System.out.println("key:\n" + Arrays.toString(numbers));

            allNumbersShow();
        }

        int numero = getIndexOfMax(allNumbers);
        int max = Arrays.stream(allNumbers).max().getAsInt();
        System.out.println("Most common number: " + numero + "\n with : " + max + " entries");


    }

    private static void allNumbersShow(){
        for (int i=0; i<numbers.length; i++){
            int x = numbers[i];
            allNumbers[x-1]++;
        }

        System.out.println("Number of times each number (1-50) was picked:\n" + Arrays.toString(allNumbers));

    }

    private static int getIndexOfMax(int allNumbers[]) {
        if (allNumbers.length == 0) {
            return -1; // array contains no elements
        }
        int max = allNumbers[0];
        int pos = 0;

        for(int i=1; i<allNumbers.length; i++) {
            if (max < allNumbers[i]) {
                pos = i;
                max = allNumbers[i];
            }
        }
        return pos + 1;
    }

}

