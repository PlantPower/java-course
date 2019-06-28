public class ifelseexamples {

    public static void main(String[] args){

        int i = 0, j = 30, k = 20, l = 40;

        if(k > j){
            if(i < j){
                System.out.println("j is in the middle");
            }
            else{
                System.out.println("j is either bigger or smaller");
            }
        }

        else {
            System.out.println("something else");
        }

    }

}
