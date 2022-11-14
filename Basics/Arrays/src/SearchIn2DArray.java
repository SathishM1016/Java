import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,6,85},
                {56,43,25},
                {21,20}
        };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element to find");
        int target = in.nextInt();
        System.out.println(Arrays.toString(search(arr ,target)));
    }
    static int[] search(int arr[][],int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0 ; row <arr.length ; row++){
            for(int col=0 ; col < arr[row].length ; col++){
                 int element = arr[row][col];
                 if(element == target){
                     return new int[]{row,col};
                 }
            }
        }
        return new int[]{-1,-1};
    }
}
