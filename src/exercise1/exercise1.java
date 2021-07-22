package exercise1;

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {

        int[] myArr = new int[]{10, 11,10, 22, 33, 44,10, 22, 33, 44, 55};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please input a number (0 to exit the program!): ");
            int inputValue = scanner.nextInt();
            int count = 0;
            if (inputValue == 0) {
                System.out.println("Bye!");
                System.exit(1);
            }
            // Hint: you need a counter here
            for (int elementIndex = 0; elementIndex < myArr.length; elementIndex++) {
                // Logic inside
                //The input number is in the array or not
                if(inputValue == myArr[elementIndex]){
                    count++;
                }
                // Hint: if we have that element, increase the counter value
            }
            if(count == 0){
                System.out.printf("The %d number isn't in the array\n", inputValue);
            }
            else{
                System.out.printf("The %d number is in the array and the number of times the number %d appears in the array is %d\n", inputValue, inputValue, count);
            }

        }

    }
}
