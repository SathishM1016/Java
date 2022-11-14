import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        String str = "Sathish";

        for(int i=0 ; i<str.length() ; i++){
            System.out.println(str[i]);
        }


        int n = 121;
        boolean rev = isPalindrome(n);
        System.out.println(rev);
    }

    static boolean isPalindrome(int n) {
        int rem, sum = 0,temp=n;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;
        }
        if (sum == temp) {
            return true;
        }
        else {
            return false;
        }
    }
}


