import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = in.nextInt();

        int res=fact(num);
        System.out.println("Factorial of a number is: "+res);
    }
    static int fact(int num) {
        int factorial=num;
        while(factorial>0) {
            factorial=1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
        return -1;
    }
}
