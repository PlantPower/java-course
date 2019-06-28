public class stringconcatinating {
    public static void main(String[] args){

        String s = "hey dude", s1 = ", whats up?", s2 = " I'm all good, my friend";

        System.out.println(s.concat(s1+s2));
        System.out.println(s.concat(s1).concat(s2));


    }
}
