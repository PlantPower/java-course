import java.util.Scanner;

public class usernameoperator{
    public static void main(String[] args){

        String username = "Brain";
        String password = "Fart";

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String userid = s.next();

        System.out.print("Enter Password: ");
        String userpass = s.next();

        if(userid.equals(username) && userpass.equals(password)){
            System.out.print("Welcome " + username);
        }
        else{
            System.out.println("Wrong username or password!");
        }

    }
}
