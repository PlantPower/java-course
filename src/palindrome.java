public class palindrome {

    public static void main(String[] args){
        //Create a Palindrome String and get its length
        String palindrome =  "Bombard a drab mob";
        int len = palindrome.length();
        char[] tempChar = new char[len];
        char[] charArr = new char[len];

        //put original string in an array of chars
        for(int i = 0; i < len; i++){
            tempChar[i] = palindrome.charAt(i);
        }
        // reverse the array of chars
        for(int j = 0; j < len; j++){
            charArr[j] = tempChar[len - 1 - j];
        }
        String reversePalindrome = new String(charArr);
        System.out.println(palindrome);
        System.out.println(reversePalindrome);

    }

}
