import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        int n1 = 0 , n2 = 1 ,n3 = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number:");
        int n = in.nextInt();

        if (n1==0 || n2==1)
        {
            System.out.println(n1+n2);
        }

        if( n > 1)
        {
            for (int i = 2; i <= n; i++)
            {
              n3 = n1 + n2 ;
              System.out.println(n3);
              n1 =n2 ;
              n2 =n3 ;
            }

        }

    }
}
