import static java.util.Scanner.*;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
   // int arr[]={106,26,5,15};
    public static int[] getIntegers(int number){
    Scanner neo = new Scanner(System.in);
    int [] value = new int[number];
        System.out.println("please Enter " + number + " integers:");
        for (int i = 0; i<number; i++) {
            value[i] = neo.nextInt();

        }
        neo.close();
        return value;
}
public static void printValue(int[] value){
        for (int i = 0; i <value.length; i++){
            System.out.println("Elements " + i + "contents " + value );
        }
}
public static int[] sortIntegers(int[] value){
        int [] sortedArray = Arrays.copyOf(value, value.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i< sortedArray.length-1; i++){
                if (sortedArray[i]< sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
}

    public static void main(String[] args) {

    }
}
