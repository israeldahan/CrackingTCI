
// Check Permutation: Given two strings, write a method to decide if one is a permutation of the
// other

public class CheckPermutation {
    private boolean isPermutation = false;


    public static boolean checkPermutation(String strFirst, String strSec){
        String strFirstTrimmed = strFirst.trim();
        String strSecTrimmed = strSec.trim();
        if(strFirstTrimmed.length() != strSecTrimmed.length()){
            return false;
        }

        int strSecPointer = strSecTrimmed.length();
        for (int index = 0; index < strFirstTrimmed.length()-1; index++) {
            char characterFirst = strFirstTrimmed.charAt(index);
            char characterSec = strSecTrimmed.charAt(strSecPointer-1);
            if(characterFirst != characterSec){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String strOne = "str ";
        String strTwo = "str";
        CheckPermutation.checkPermutation(strOne, strTwo);
    }

}
