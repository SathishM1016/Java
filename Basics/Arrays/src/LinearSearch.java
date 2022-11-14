import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {25,36,52,48,46,55};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to find in the array ");
        int target = in.nextInt();

        int ans =find(arr,target);
        System.out.println("Element found at the index " + ans);
    }
    static int find(int arr[] , int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];

            if(element==target){
                return i;
            }
        }
        return -1;
    }
    }
