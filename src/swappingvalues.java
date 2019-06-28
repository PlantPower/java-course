public class swappingvalues {

    public static void main(String[] args){

        int a = 30;
        int b = 45;

        swampFunction(a,b);
    }

    public static void swampFunction(int a, int b){

        System.out.println("Before a= " + a + " b= " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After  a= " + a +" "+ "b= " + b );
    }

}
