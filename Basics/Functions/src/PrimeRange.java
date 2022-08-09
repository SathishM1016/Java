import java.util.Scanner;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the starting number: ");
        int start = in.nextInt();

        System.out.println("Enter the ending number: ");
        int end = in.nextInt();

        for(int i=start;i<=end;i++){
            if(findPrime(start)){
                System.out.println("Range of prime numbers between " + start + " and " + end + " " + "is" +  );
            };

        }
    }
    static boolean findPrime(int num){

        if(num<2){
            return false;
        }
        else{
            int x=num/2;
            for(int i=2;i<x;i++){
                if(num%2==0){
                    return false;
                }
            }
        }
        return true;
    }
}


