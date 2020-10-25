package regex;

public class text_emial {
    public static void main(String[] args) {
        //判断输入内容是否符合格式

        String email="asd12356@163.com";

        String regex="\\w*@[A-Za-z0-9]+\\.(com|cn|net)";

        boolean isMached =email.matches(regex);


        if (isMached)
        {System.out.println("匹配成功");
    }
        else {
            System.out.println("匹配不成功");}
}
}
