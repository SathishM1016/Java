import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        int rem, sum=0 ,temp ;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any  number:");
        int n = in.nextInt();
        temp=n;

        while(n>0)
        {
            rem = n % 10 ;
            sum = (sum*10)+rem;
            n/=10;
        }
        if (sum==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
