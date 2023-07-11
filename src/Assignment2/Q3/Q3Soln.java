package Assignment2.Q3;

public class Q3Soln {

  //it basically is an if -else-if -else ladder.
    //it check the value of a variable against many input values.
    //switch expression must be of type byte,short ,char,int ,long(ALong with its Wrapper types)String,enum
    //it executes multiple statement from multiple conditions.
    //data type of value of a case must be same as in the switch expression
    //it is a fall through statement.if no break statement is there ,it will execute all the statement.
  public static void main(String[] args) {
      int dayNo=7;
      String day;
      switch (dayNo){
          case 1:day="Monday";break;
          case 2:day="Tuesday";break;
          case 3:day="Wednesday";break;
          case 4:day="Thursday";break;
          case 5:day="Friday";break;
          case 6:day="Saturday";break;
          case 7:day="Sunday";break;
          default:day="no day  found";


      }
      System.out.println(day);

  }

}
