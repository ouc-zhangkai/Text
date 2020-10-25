package regex;

public class text_replace {
    public static void main(String[] args) {
        //替换中间数字为*
        String phone = "13853951160";

        String regex="(\\d{3})\\d{4}(\\d{4})";

        String replaced="$1****$2";

        String isReplaced = phone.replaceAll(regex,replaced );

        System.out.println(isReplaced);
    }
}
