import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][2];

        // input

        for (int row = 0; row < arr.length; row++) { // outer for loop
            for (int col = 0; col < arr[row].length; col++) {  // each element inside a row is a array itself
                arr[row][col]=in.nextInt();
            }
        }

//        for (int row = 0; row < arr.length; row++) { // outer for loop
//            for (int col = 0; col < arr[row].length; col++) {  // each element inside a row is a array itself
//                System.out.print(arr[row][col]+ " ");
//            }
//        }

        // ouput

        for (int[] i:arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
