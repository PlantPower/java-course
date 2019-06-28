import java.util.Scanner;

public class elseifstatement {

    public static void main(String[] args) {
        int age;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hur gammal är ni ?: ");
        age = myScanner.nextInt();

        if(age >= 20 && age <= 90){
            System.out.println("Välkommern kompis, drick dig full för fan");
        }
        else if(age >=90){
            System.out.println("Du börjar bli lite flr gammal för det här farfar");
        }
        else{
            System.out.println("Det blir nog bara vatten för dig idag pöjk");
        }

    }

}


