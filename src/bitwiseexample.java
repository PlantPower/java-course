public class bitwiseexample {

    public static void main(String[] args){

        int a = 0x0005;
        int b = 0x0007;

        //bitwise and 0101 & 0111 = 0101

        System.out.println("a&b = " + (a & b));

        //bitwise and 0101 | 0111 = 0111

        System.out.println("a|b = " + (a|b));

        //bitwise and 0101 | 0011 = 0111

        System.out.println("~a = " + ~a);

        //bitwise and 0101 | 1010 = 0111

        System.out.println("a^b = " + (a^b));
    }
}
