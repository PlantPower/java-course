import java.util.Scanner;

public class switchstatement {

    public static void main(String[] args){
        int age;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hur gammal är du ? ");
        age = myScanner.nextInt();

        switch (age) {
            case 18:
                System.out.println("Age 18");
                break;
            case 20:
                System.out.println("Age 20");
                break;
            case 25:
                System.out.println("Age 25");
                break;
            default:
                System.out.println("Not found age");
                break;

        }
    }
}
