package Assignment2.Q7;

public class Q7Soln {
    //mutable Strings :when we create a new String object ,it is immutable in nature means its content you cant change .when you try to change its content ,it will result in creating a new object
    //thus solution for this is mutable String .and for this java has two classes named StringBuffer and StringBulder

    public static void main(String[] args) {
        String str1="kaliMaa";
        System.out.println(str1.hashCode());//-941380870
        str1="dmvd";
        System.out.println(str1.hashCode());//3087607
        //hashcode has changed ,means str1 has started to pointing to new object .old object has not been changed.

        StringBuilder str2=new StringBuilder("DurgaMaa");
        System.out.println(str2.hashCode());//511754216
        str2.append("DeviMaa");
        System.out.println(str2.hashCode());//511754216
        //same hashcode even when we change ,the content of original string .it means this string is modifiable .
        //this is called mutable String

    }


}

