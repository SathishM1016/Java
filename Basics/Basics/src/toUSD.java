import java.util.Scanner;

public class toUSD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount in Rupees :");
        double INR = in.nextDouble();

        double USD = INR * 0.013 ;
        System.out.println("Amount in USD is " + USD);
    }
}
