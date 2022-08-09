import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        isPrime(n);

    }
    static void isPrime(int n){


            if(n<=1){
                System.out.println(n+ " " + "is neither prime nor composite");
            }
            else if(n%2==0){
                System.out.println(n+ " " + "is not a prime number");
            }
            else {
                System.out.println(n+ " " + "is a prime number");
            }
        }

}
