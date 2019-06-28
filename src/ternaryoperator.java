public class ternaryoperator {

    public static void main(String[] args) {
        int n1, n2;
        n1 = 25;
        n2 = (n1 == 10) ? 100:200;

        System.out.println("n2: " + n2);

        n2 = (n1 == 25) ? 100:200;
        System.out.println("n2: " + n2);
    }

}
