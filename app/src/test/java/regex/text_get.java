package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class text_get {
    public static void main(String[] args) {

        // 获取3个字母组成的单词

        Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");

        Matcher word = pattern.matcher("Today is Sunday!");

        while (word.find()) {
            System.out.println(word.group());
        }
    }
}
