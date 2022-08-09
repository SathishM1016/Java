import java.sql.SQLOutput;
import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = in.nextInt();

        checkAge(age);
    }
    static void checkAge(int age){

        if(age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
