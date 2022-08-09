import java.util.Scanner;

public class demo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if(a > 0) {

            for (int i = 0; i < a; i++) {
                int res=a[i];
                System.out.println(res);
            }
            System.out.println(res);
        }


    }
}
