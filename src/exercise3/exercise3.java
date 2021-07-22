package exercise3;

public class exercise3 {

    public static void main(String[] args) {
        int []myArray = new int[]{1,1,1,1,1};
        for(int i = 0; i < myArray.length -1; i++){
            for(int j = i+1; j < myArray.length; j++){
                if(myArray[i] > myArray[j]){
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.printf("Array after sort is:\n");
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}
