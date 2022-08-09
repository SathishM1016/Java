import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("enter 1st number:");
        int a = in.nextInt();

        System.out.print("enter 2nd number:");
        int b = in.nextInt();

        System.out.print("enter 3rd number");
        int c = in.nextInt();

        int maximum=max(a,b,c);
        System.out.println("Largest among three numbers is :"+maximum);

        int minimum=min(a,b,c);
        System.out.println("Smallest among three numbers is :"+minimum);


    }

    static int max (int a ,int b ,int c) {
        int max = a;
        if (b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }

    static int min(int a , int b ,int c) {
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;

    }
//        int result=Largest(5, 6, 7);
//        System.out.println(result);
    }
//        static int Largest(int a ,int b ,int c) {
//            int max;
//            if (a >= b && a >= c) {
//                max = a;
//            } else if (b >= c) {
//                max = b;
//            } else {
//                max = c;
//            }
//            return max;
//        }
//
//
//
//}
//
//
