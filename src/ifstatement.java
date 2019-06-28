import java.util.Scanner;
public class ifstatement {

    public static void main(String[] args){

        int age;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input your age, please: ");
        age = myScanner.nextInt();

        if (age > 20){
            System.out.println("monopolbolaget låter dig godtyckligen bli full.");
        }

    }


}
