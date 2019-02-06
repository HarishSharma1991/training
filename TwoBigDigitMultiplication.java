package twobigdigitmultiplication;

import java.util.Scanner;
public class TwoBigDigitMultiplication {
    static int bigdigit1;
    static int bigdigit2;
   static  int multiplication;

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter first no ");
        bigdigit1 = in.nextInt();
        System.out.print("enter second no ");
        bigdigit2= in.nextInt();

        multiplication = bigdigit1 * bigdigit2;

//            System.out.println(  bigdigit1);
//            System.out.println( bigdigit2);
            System.out.println(multiplication);

    }
}
