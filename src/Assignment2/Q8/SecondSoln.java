package Assignment2.Q8;

import java.util.Arrays;

public class SecondSoln {

    public static void main(String[] args) {
        String string="ShwetaBharty";
        String str2=string.toLowerCase();
        char ch[]=str2.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);

    }

}
