import org.jetbrains.annotations.NotNull;


//        URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
//        has sufficient space at the end to hold the additional characters, and that you are given the "true"
//        length of the string. (Note: If implementing in Java, please use a character array so that you can
//        perform this operation in place.)
public class URLify {

    public static @NotNull String URLify(@NotNull String str){
        StringBuilder sb=new StringBuilder("");
        for (int index = 0; index < str.length() ; index++) {
            if (String.valueOf(str.charAt(index)).equals(" ")){
                sb.append(String.valueOf("%20"));
            } else {
                sb.append(String.valueOf(str.charAt(index)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "we see a space, we replace it with %20. If there is no space, then we copy the original character.";
        String urlify = URLify(str);
        System.out.println(urlify);
//        CheckPermutation.checkPermutation(strOne, strTwo)
    }

}
