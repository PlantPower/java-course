import java.util.Scanner;

public class matchoutcome {

    public static void main(String[] args){
        int yankees, socks;
        Scanner scoreScanner = new Scanner(System.in);
        System.out.println("Please fill out the teams Score");
        System.out.println("Yankees");
        yankees = scoreScanner.nextInt();
        System.out.println("Socks");
        socks = scoreScanner.nextInt();
        if(yankees > socks){
            System.out.println("Yankees - Socks:  " + yankees +" "+ socks );
            System.out.println("Yankees WIN!");
        }
        else if(socks > yankees){
            System.out.println("Socks - Yankees:  " + socks +" "+ yankees );
            System.out.println("Socks WIN!");
        }
        else {
            System.out.println("It's a Tie");
            System.out.println("Yankees - Socks: " + yankees +" "+ socks);
        }

    }

}
