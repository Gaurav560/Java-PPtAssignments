package Assignment3.Q3;
class Bike{
    void run(){System.out.println("running");}
}
class Splendor extends Bike{
    void run(){System.out.println("running safely with 100km");}

    public static void main(String args[]){
        Bike b = new Splendor();//upcasting
        b.run();
    }
}