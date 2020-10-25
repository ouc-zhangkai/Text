package regex;

import java.util.regex.Pattern;

public class text_password {
    public static void main(String[] args) {
        //判断输入的密码是否符合格式

        String txt="ASS344";

        boolean isMached= Pattern.matches("^[A-Z][a-z+A-Z0-9{1,}_]{7,15}$",txt);



        if (isMached){
            System.out.println("匹配成功");
        }
        else {System.out.println("匹配不成功");}
    }
}
