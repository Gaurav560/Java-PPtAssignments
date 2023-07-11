package Assignment3.Q5;

interface Parent
{
    void moo();
}

class A implements Parent
{

    A(int x, int y)
    {

    }

    public void moo()
    {
        System.out.println("In the moo method of class A.");
    }
}

class B implements Parent
{
    public void moo()
    {
        System.out.println("In the moo method of class B.");
    }
}

public class CouplingExample2
{


    public static void main(String argvs[])
    {
        B obj = new B();
        obj.moo();
    }
}
