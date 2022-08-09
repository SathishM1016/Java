import java.util.Scanner;

public class largestNum {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = in.nextInt();

        if(num1>num2)
        {
            System.out.println(num1 + " " + " is the largest number");
        }
        else
        {
            System.out.println(num2 + " " + "is the largest number");
        }
    }
}
