public class finnaly {
       public static void main(String args[]) {
           int a[] = new int[2];
           try {
               System.out.println("Access element three " + a[3]);
           } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Exception throw " + e);
           } finally {
               a[0] = 6;
               System.out.println("First element Value " + a[0]);
               System.out.println("The finally statment is executed");
           }
       }
}