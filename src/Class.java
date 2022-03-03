import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String Class_Regex ="^[C|A|P]\\d{4}[G|H|I|K|L|M]$";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(Class_Regex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
