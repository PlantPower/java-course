public class singledimarray {

    public static void main(String[] args){

        //Print out single dimension array data
        //Easy to understand version, could of course do it very much simpler and neater.

        int[] a = new int[5];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 50;
        a[4] = 100;

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
