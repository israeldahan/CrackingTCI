

//Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
//        A palindrome is a word or phrase that is the same forwards and backwards. A permutation
//        is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class PalindromPermutation {

    public static boolean checkPermutation(Hashtable<String, Integer> table, int lengthStr){

        Integer sumOfOdd = 0;
        for (Map.Entry<String, Integer> e : table.entrySet()) {
            if(e.getValue() % 2 != 0 ){
                sumOfOdd++;
            }
        }
        if (lengthStr % 2 == 0) {
            if (sumOfOdd > 0 ){
                return false;
            }
        } else {
            if (sumOfOdd > 1 ){
                return false;
            }
        }
        return true;
    }

    public static boolean PalindromPermutation(String str){

        String permutation = str.toLowerCase();
        Hashtable<String, Integer> words = new Hashtable<>();
        for (int i = 0; i < permutation.length(); i++) {
            String word = Character.toString(permutation.charAt(i));
            if(words.get(word) == null){

                words.put(word, 1);
            } else {
                words.put(word, words.get(word) + 1);
            }
        }
        boolean ifPerm = checkPermutation(words, str.length());

        return ifPerm;
    }


    public static void main(String[] args){
        boolean ifPerm = PalindromPermutation("iissjjggj");
        System.out.println(ifPerm);
    }

}
