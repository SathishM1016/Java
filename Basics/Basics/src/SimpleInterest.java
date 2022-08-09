import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal amount:");
        double p = in.nextDouble();

        System.out.print("Enter the number of years:");
        int n = in.nextInt();

        System.out.print("Enter the rate of interest:");
        float r = in.nextFloat();

        double SI = (p*n*r)/100;
        System.out.println("Simple interest after "+ n + "years is :" +SI);

    }
}
