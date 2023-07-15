package Assignment3.Q6;



//Encapsulation prevents access to data members and data methods by any external classes.
// The encapsulation process improves the security of the encapsulated data.
class TestEncapsulation {
    private String privateVar;
    TestEncapsulation() {
        privateVar = "java";
    }
    public void getVariable() {
        System.out.println(privateVar);
    }
    public void setVariable(String setvalue) {
        privateVar = setvalue;
    }
}
public class PrivateVariables {
    public static void main(String[] args) {
        TestEncapsulation test = new TestEncapsulation();
        test.setVariable("JAVA");
        test.getVariable();
    }
}