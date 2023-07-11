package Assignment2.Q6;

public class Q6Soln
{
   //there can be many ways of comparing two strings.but based on data we can compare two strings with an inbuilt method fo String class i.e,equals()
//another inbuilt method can be equalsIgnoreCase()  or Object.equals(Object a,Object b)--->it returns boolean
    public static void main(String[] args) {
        String str1="kaliMaa";
        String str2="KaliMaa";
        if (str1.equals(str2)){
            System.out.println("both strings are equal ");

        }else {
            System.out.println("both Strings are not equal");
        }
    }


}
