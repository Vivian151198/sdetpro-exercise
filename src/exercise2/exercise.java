package exercise2;

import java.util.Scanner;

public class exercise {

    public static void main(String[] args) {

        final int MAX_ARR_LENGTH = 3;
        // Declare an array with length is 10
        int[] myArr = new int[MAX_ARR_LENGTH];
        Scanner scanner = new Scanner(System.in);

        // This to keep where to put data and conditional if user input over 10 numbers
        int currentElementIndex = 0;
        double averageNum = 0.0;
        while (true) {
            if (currentElementIndex >= MAX_ARR_LENGTH) {
                break;
            }
            System.out.println("Please input up to 10 numbers (0 to exit the program!): ");
            int inputValue = scanner.nextInt();
            if (inputValue == 0) {
                System.out.println("Calculating value....");
                System.exit(1);
            }
            myArr[currentElementIndex] = inputValue;
            currentElementIndex++;

        }
        double SUM = 0;
        for (int i = 0; i < MAX_ARR_LENGTH; i++) {
            SUM += myArr[i];
        }
        averageNum = SUM / MAX_ARR_LENGTH;
        System.out.printf("You  inputted over 10 numbers and average number is %f", averageNum);

    }
}
