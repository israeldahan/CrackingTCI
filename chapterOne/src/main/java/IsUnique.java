import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class IsUnique {

    public static Map<String, Integer> uniqueArray = new HashMap<String, Integer>();

    public static String IsUnique(String isUnique){

        for (int i = 0; i <= isUnique.length() -1; i++){
            if(uniqueArray.get(String.valueOf(isUnique.charAt(i))) == null){
                uniqueArray.put(String.valueOf(isUnique.charAt(i)), 1 );
            } else {
                return "String isn't unique";
            }
        }
        return "String is unique";
    }

    public static void main(String[] args) {
        String text = "abcefhij";
        String test = IsUnique.IsUnique(text);
        System.out.println(test);
    }
}


