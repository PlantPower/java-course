import java.util.Scanner;

public class enumexample {

    enum winner{home, visitor, tie}

    public static void main(String[] args){
        int h, v;

        Scanner myScanner = new Scanner(System.in);
        String home = "";
        String visitor = "";
        System.out.println("Home Team: ?");
        home = myScanner.next();
        System.out.println("Visitor Team ?");
        visitor = myScanner.next();
        System.out.println(home + " Score : ");
        h = myScanner.nextInt();
        System.out.println(visitor + " Score : ");
        v = myScanner.nextInt();
        String tie = "There was a tie";

        if(h > v){
            winner win = winner.home;
            System.out.println(home +" won the game by " + (h-v) + " goals");
        }
        else if(v > h){
            winner win = winner.visitor;
            System.out.println(visitor + " won the game by " +(v-h) + " goals");
        }
        else{
            System.out.println(tie);
        }

        System.out.println("Score: " + home +" " + h + " - "+ v +" "+  visitor);

    }
}
