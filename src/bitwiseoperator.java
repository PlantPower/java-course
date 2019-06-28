public class bitwiseoperator {

    public static void main(String[] args){

        int n1 = 11;
        int n2 = 22;
        int res = 0;
        res = n1 & n2;

        System.out.println("n1 & n2 " + res);

        res = n1 | n2;
        System.out.println("n1 | n2 " + res);

        res = n1 ^ n2;
        System.out.println("n1 ^ n2 " + res);

        res = n1;
        System.out.println("n1 " + res);

        res = n1 << 2;
        System.out.println("n1 << n2 " + res);

        res = n1 >> 2;
        System.out.println("n1 >> n2 " + res);

        res = n1 >>> 2;
        System.out.println("n1 >>> n2 " + res);
    }

}
