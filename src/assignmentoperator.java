public class assignmentoperator {

    public static void main(String args[]){
        int n1 = 10;
        int n2 = 20;
        n2 = n1;

        System.out.println("= output " + n2);

        n2 += n1;
        System.out.println("+= output " + n2);

        n2 -= n1;
        System.out.println("-= output " + n2);

        n2 *= n1;
        System.out.println("*= output " + n2);

        n2 /= n1;
        System.out.println("/= output " + n2);
    }

}
