import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int n1 = in.nextInt();

        System.out.print("Enter 2nd number : ");
        int n2 = in.nextInt();

        int result = sum(n1,n2);
        System.out.println("Sum of two numbers: "+result);
    }

    static int sum(int n1 , int n2){
       return n1+n2;
    }

}
