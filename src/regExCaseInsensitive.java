import java.util.regex.*;

public class regExCaseInsensitive {
    public static void main(String[] args){
        String content = "This is a tutorial Website!";
        String patternString = ".*tuToRiaL.*";

        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);

        System.out.println(pattern);
    }


}
