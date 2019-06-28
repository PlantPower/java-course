import java.util.Scanner;

public class ifelsestatement {
    public static void main(String[] args) {
        int age;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Du är över 20 va ?: ");
        age = myScanner.nextInt();

        if(age >=20 ){
            System.out.println("Drick dig full för fan");
        }
        else {
            System.out.println("Enbart vatten för dig tölp");
        }
    }
}

