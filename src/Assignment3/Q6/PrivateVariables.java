package Assignment3.Q6;
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