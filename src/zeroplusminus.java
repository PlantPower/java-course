import java.util.Scanner;

public class zeroplusminus {

    public static void main(String[] args){
        int res;
        int zero = 0;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input any Integer");
        res = myScanner.nextInt();

        if(zero < res){
            System.out.println(zero = +1);
        }
        else if(zero > res){
            System.out.println(zero = -1);
        }
        else {
            System.out.println(zero);
        }
    }

}
