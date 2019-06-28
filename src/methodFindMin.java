public class methodFindMin {
    public static void main(String[] args){
        int i = 23;
        int j = 45;
        int f = minFunction(i,j);

        System.out.println("Min Value " + f);
    }

    public static int minFunction(int n1, int n2){
        int min;
        if(n1 > n2)
            min=n2;
        else
            min=n1;

        return min;
    }

}
