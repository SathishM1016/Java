import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number to find whether it is even or odd :  ");

        int n = in.nextInt();

        boolean res=find(n);
        System.out.println("Is given number is a prime :" +res);

    }
    static boolean find(int n){

        while (n%2 == 0){
            return true;
        }
        return false;
    }
}
