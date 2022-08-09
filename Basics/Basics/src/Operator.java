import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {


            System.out.println("Enter the any opertor + , - , * , / : ");
            char operator = in.next().trim().charAt(0);


            if (operator == '+' || operator == '-' || operator == '*' || operator == '/')
            {
                System.out.print("Enter two numbers :");

                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (operator == '+')
                {
                    ans = num1 + num2;
                }
                if (operator == '-')
                {
                    ans = num1 - num2;

                }
                if (operator == '*')
                {
                    ans = num1 * num2;

                }
                if (operator == '/')
                {
                    ans = num1 / num2;

                }
            }
                else if (operator == 'x' || operator == 'X')
                {
                    System.out.println("End");
                    break;
                }
                else
                {
                    System.out.println("Invalid operation");
                }

            System.out.println("Answer : " + ans);
        }

    }
}


