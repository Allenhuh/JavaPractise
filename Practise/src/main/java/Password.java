import java.util.regex.*;
public class Password {

    public static boolean passwordValid(String s){
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + ".{8,20}$";

        Pattern p = Pattern.compile(regex);
        if (s == null) {
            return false;
        }

        Matcher m = p.matcher(s);

        return m.matches();

    }

    public static void main(String[] args) {
        String a = "Pass123";
        String b = "Passqwe89qw";

        System.out.println("Input a: " + passwordValid(a));
        System.out.println("Input b: " + passwordValid(b));

    }
}
