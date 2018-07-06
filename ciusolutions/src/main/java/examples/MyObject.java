package examples;

public class MyObject {
    public Object lock = new Object();

    public void doSomething() {
        synchronized (lock) {
            System.out.println("MyObject.doSomething method");
        }
    }
}
