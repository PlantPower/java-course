import java.util.Arrays;

public class foorloops {
    public static void main(String[] args){

        //Prints out a sequence of the integer from 0 - 12

        int[] arr0 = new int[12];
        int i;
        for(i = 0; i < arr0.length; i++){
            arr0[i]= i + 1;
            System.out.println(arr0[i]);

        }

        //Print array using for loop

        int[] arr1 = {2,3,532,53};
        for(int element: arr1){
            System.out.println(element);
        }

        //Print array using standard Array Library
        // import java.until.Arrays

        int[] arr2 = {1,3,6,8,};
        System.out.println(Arrays.toString(arr2));

        //Print a multi dimensional Array
        //using  import java.util.Arrays

        int[][] arry3 = {{1,23}, {23,434}, {9823,24334},{623,443}};
        System.out.println(Arrays.deepToString(arry3));

        //Printing an Array using foor loop

        int[] arry4 = {2,5,3,6,4};
        for(int j = 0; j < arry4.length; j++){
            System.out.println(arry4[j]);
        }
    }
}

