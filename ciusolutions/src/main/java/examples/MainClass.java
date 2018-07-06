package examples;

public class MainClass {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        //change the lock Object reference
        myObject.lock = new Object();
        myObject.doSomething();
    }
}
