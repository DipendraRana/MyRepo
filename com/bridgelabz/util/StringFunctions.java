import java.util.Random;

public class StringFunctions {

    public static int repetitionInStr1, repetitionInStr2;   //counting repetition of particular char in String

    public static int counter;

    public static char string[],permutedString[];

    public static boolean anagram(String str1, String str2) {
        if (str1.length() == str2.length()) {   //checking only if two strings are equal in length
            for (int i = 0; i < str1.length(); i++) {
                repetitionInStr1 = 0;
                repetitionInStr2 = 0;
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j))   //counting occurrences of a char in another string
                        repetitionInStr2++;
                    if (str1.charAt(i) == str1.charAt(j))   //counting occurrences of a char in its own string
                        repetitionInStr1++;
                }
                if (repetitionInStr1 != repetitionInStr2)
                    return false;
            }
            return true;
        } else
            return false;
    }

    public static boolean palindrome(String word) {
        int stringLength = word.length();
        string = new char[stringLength];
        string=word.toCharArray();  //copying string to char array
        counter = 0;
        for (int i = 0, j = stringLength - 1; i <= (stringLength - 1) / 2; i++, j--) {
            if (string[i] == string[j])
                counter++;
        }
        boolean isOdd = (stringLength % 2 != 0);
        if (isOdd && counter == (stringLength + 2) / 2)    //checking palindrome for odd length string
            return true;
        else if (counter == stringLength / 2)   //for even length string
            return true;
        else
            return false;
    }

    public static String[] permutationIteration(String word,int charAvailableToUse){
        int permutation=(int)MathFuction.factorial(charAvailableToUse);
        String newWords[]=new String[permutation];
        for (int i=0;i<permutation;i++){
           newWords[i]=doPermutation(word);
        }
        return newWords;
    }

    public static String doPermutation(String word){
        string=word.toCharArray();
        Random indexpicker=new Random();
        int choosedindex=indexpicker.nextInt(word.length());
        permutedString[0]=string[choosedindex];
        for(int i=)
    }

    public static void main(String args[]) {
        String str1 = args[0];
        //String str2 = args[1];
        boolean ans = palindrome(str1);
        System.out.println(ans);
    }
}
