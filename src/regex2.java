import java.util.regex.*;
public class regex2 {

    //Regular Expression .*book*. is used to search the occurrence of string book in the text
    public static void main(String[] args){

        String content = "This is the string" + "we are looking for books";
        String pattern = ".*book.*";

        boolean Match = Pattern.matches(pattern, content);
            System.out.println("The text contains the word book? " + Match);

    }


}
