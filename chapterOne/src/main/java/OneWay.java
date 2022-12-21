public class OneWay {

    private static Boolean ChekIfOneEdit(String source, String edited){
//        if length > or < 1
        int flagOneWay = 0;
        if (source.length() != edited.length()){
            int sl = source.length();
            int el = edited.length();
            if (sl - el > 1 ){
                return false;
            } else if (el - sl > 1) {
                return false;
            }
        }
        for (int i = 0; i < source.length(); i++){
            char ce = '\0';
            char c = source.charAt(i);
            if (edited.length() > i ){
                ce = edited.charAt(i);
            }
            if (c == ce){
                System.out.println(c + " " + ce + " is equal");
            } else {
                System.out.println(c + " " + ce + " is not equal");
                flagOneWay = flagOneWay + 1;
            }
        }
        if (flagOneWay > 1) {
            return false;
        }else {
            return true;
        }
    }
    public static void main(String[] args) {
        String text1 = "pale";
        String text1Edit = "pal ";
        String text2 = "pales";
        String text2Edit = "pale";
        String text3 = "pale";
        String text3Edit = "bale";
        String text4 = "pale";
        String text4Edit = "bake";
        boolean t = OneWay.ChekIfOneEdit(text1, text1Edit);
        System.out.println("t: " + t);
        boolean t2 = OneWay.ChekIfOneEdit(text2, text2Edit);
        System.out.println("t2: " + t2);
        boolean t3 = OneWay.ChekIfOneEdit(text3, text3Edit);
        System.out.println("t3: " + t3);
        boolean t4 = OneWay.ChekIfOneEdit(text4, text4Edit);
        System.out.println("t4: " + t4);

    }
}
