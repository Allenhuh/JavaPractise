import java.util.Scanner;

public class ReverseInteger {

    public static int reverseInteger(int input){
        int reverse = 0;
        while (input != 0){
            int digit = input % 10;
            reverse = reverse * 10 + digit;
            input /= 10;
        }
        return reverse;
    }

    public static void main(String[] args){
        Scanner req = new Scanner(System.in);
        int n = req.nextInt();
        System.out.println("Input: " + n);
        ReverseInteger o = new ReverseInteger();
        System.out.println("Reverse Input: " + o.reverseInteger(n));

    }
}
