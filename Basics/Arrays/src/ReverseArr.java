import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
       smallest(arr);
    }
    static void smallest(int[] arr){

        for (int i=0 ; i<arr.length ; i++){
            for(int j=1 ; j<arr.length ; j++){
                int temp=0;
                if(arr[i]<arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        for(int i=0 ;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
