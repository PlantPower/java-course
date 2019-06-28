public class heighestnumber {
    public static void main(String[] args){
        int[] i = {120,872,287,928,239,837,192,892,982,143};
        int heighest = maximum(i);
        System.out.println("Heighest number " + heighest);
    }

    private static int maximum(int[] numbers){
        int maxSoFar = numbers[0];
        for(int num:numbers){
            if(num > maxSoFar){
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
}
