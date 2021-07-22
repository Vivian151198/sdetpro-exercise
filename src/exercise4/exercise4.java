package exercise4;

public class exercise4 {

    public static void main(String[] args) {
        int []myArray = new int[]{1,2,3,4,5,6,7,8};
        for(int i = 0; i < (myArray.length)/2; i++ ){
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        System.out.printf("Array after revert is:\n");
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

}
