package regex;

import java.util.Arrays;

public class text_cutting {
    public static void main(String[] args) {
        // 切割获取每一个字符组
        String sentence = "are you ok !";

        String regex = "\\p{Space}+";

        String[] split = sentence.split(regex);

        System.out.println(Arrays.toString(split));}
}
