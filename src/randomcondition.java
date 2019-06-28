public class randomcondition {

     public static void main(String[] args){
         double num = 0.5;
         double result = Math.random();

         while(num > result){
             System.out.println("Result is less than 0.5");
             result++;
         }
         System.out.println(result);
     }
}
