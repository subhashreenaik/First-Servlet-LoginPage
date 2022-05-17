import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean checkUser(String user) {

        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
        Matcher m = p.matcher(user);
        boolean b = m.matches();
        return b;

    }
    public static boolean checkPassword(String password) {

        Pattern p = Pattern.compile("(?=.*[A-Z]){1}(?=.*[0-9]){1}(?=.*[!@#$&*]){1}([A-Za-z0-9]).{5,}");
        Matcher m = p.matcher(password);
        boolean b = m.matches();
        return b;

    }

}
