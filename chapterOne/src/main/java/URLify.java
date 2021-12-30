import org.jetbrains.annotations.NotNull;

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
        String str = "israel david dahan";
        String urlify = URLify(str);
        System.out.println(urlify);
//        CheckPermutation.checkPermutation(strOne, strTwo)
    }

}
