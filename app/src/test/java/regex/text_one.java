package regex;

import java.util.regex.Pattern;

public class text_one {
    public static void main(String[] args) {


        String txt="asdf";


        String regex="[a]";

        boolean isMached= Pattern.matches(regex,txt);


        if (isMached){
            System.out.println("匹配成功");
        }
        else {System.out.println("匹配不成功");}
    }
}