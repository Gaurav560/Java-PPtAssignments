package Assignment2.Q8;

public class Q8Soln {
    //program to sort string alphabetically
    public static void main(String[] args) {
String str="ShwetaBharty";
String str1=str.toLowerCase();
char arr[]=str1.toCharArray();
char temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;

                }

            }

            }
        System.out.println(arr);
        }
    }

