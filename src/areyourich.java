import java.util.Scanner;
import java.util.*;

public class areyourich {
    public static void main(String[] args) {


        int num;
        String a ="Your Poor";
        String b = "Not very much";
        Scanner myScan = new Scanner(System.in);
        System.out.print("How much money do you have ?: ");
        num = myScan.nextInt();

        if (num < 100 && num >= 1) {
            System.out.println(a);
        } else if (num <= 1000 && num >= 100) {
            System.out.println(b);
        } else if (num <= 10000 && num >= 1000) {
            System.out.println("A bit more");
        } else if (num <= 100000 && num >= 10000) {
            System.out.println("No we are talking");
        } else if (num <= 999999 && num >= 100001) {
            System.out.println("Your Rice!");
        } else {
            System.out.println("YOUR A MILLIONARE!");
        }
    }
}
