import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {

    public static String reverseStr(String s) {
        char[] strArray = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = strArray.length -1; i >= 0; i--){
            str.append(strArray[i]);
        }
        String resultStr = String.valueOf(str);
        return resultStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Input String: " + input);
        System.out.println("Reverse String: " + reverseStr(input));
    }
}
