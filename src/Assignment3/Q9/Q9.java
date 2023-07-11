package Assignment3.Q9;
// Abstraction is mainly used when we are concerned with ‘what an application does’ instead of ‘how this application does
interface DrawShapes {
    //abstract method
    void draw();
}

class Rectangle implements DrawShapes {
    //implementing the abstract method
    public void draw() {
        System.out.println("Rectangle will be drawn");

    }
}

class Circle implements DrawShapes {
    //implementing the abstract method
    public void draw() {
        System.out.println("Circle will be drawn");

    }
}

class Testing {
    public static void main(String args[]) {
//creating an object of DrawShapes class
        DrawShapes shape = new Circle();
        //I have implemented the abstract method draw already
        shape.draw();
    }
}


