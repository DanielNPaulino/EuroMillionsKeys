//author: Daniel Paulino

import java.util.Arrays;
import java.util.Scanner;

public class Keys {
    private static int[] numbers = new int[5];
    private static int[] allNumbers = new int[50];
    private static Scanner input = new Scanner(System.in);

    private static int[] stars = new int[2];
    private static int[] allStars = new int[13];




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

            for (int i = 0; i < stars.length; i++) {
                System.out.println("Insert the 2 stars (from 1-13) of the key");
                stars[i] = input.nextInt();
            }

            System.out.println("key:\n" + Arrays.toString(numbers) + Arrays.toString(stars));


            allNumbersShow();
            allStarsShow();
        }

        int numero = getIndexOfMax(allNumbers);
        int maxNumber = Arrays.stream(allNumbers).max().getAsInt();
        System.out.println("Most common number: " + numero + "\n with : " + maxNumber + " entries");

        int star = getIndexOfMaxStar(allStars);
        int maxStar = Arrays.stream(allStars).max().getAsInt();
        System.out.println("Most common star: " + star + "\n with : " + maxStar + " entries");


    }

    private static void allNumbersShow(){
        for (int i=0; i<numbers.length; i++){
            int x = numbers[i];
            allNumbers[x-1]++;
        }

        System.out.println("Number of times each number (1-50) was picked:\n" + Arrays.toString(allNumbers));

    }

    private static void allStarsShow(){
        for (int i=0; i<stars.length; i++){
            int x = stars[i];
            allStars[x-1]++;
        }
        System.out.println("Number of times each star (1-13) was picked:\n" + Arrays.toString(allStars));

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

    private static int getIndexOfMaxStar(int allStars[]) {
        if (allStars.length == 0) {
            return -1; // array contains no elements
        }
        int max = allStars[0];
        int pos = 0;

        for(int i=1; i<allStars.length; i++) {
            if (max < allStars[i]) {
                pos = i;
                max = allStars[i];
            }
        }
        return pos + 1;
    }

}

