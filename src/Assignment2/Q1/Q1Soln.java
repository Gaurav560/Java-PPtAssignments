package Assignment2.Q1;

public class Q1Soln {
    //there are three conditional operators in java
    //1.logical and operator(&&)-if both the operands are true then only answer is true
    //2.logical or operator(||)-if only one of the operand is true ,then it can be true
    //3.ternary operator(?:)-can be used in the case of if-else but not always
    public static void main(String[] args) {
        int x=20;
        int y=30;
        int z=40;

        if (x>y&&y>z){
            System.out.println("gaurav");
        } else if (x>y||z>y)
        {
            System.out.println("sameer");
        }else {
            System.out.println("dr");
        }
    }



}

