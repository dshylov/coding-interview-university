package examples;

public class TestTest {
    public static void main(String[] args) {
        String a1 = new String("a1").intern();
        String a2 = new String("a2").intern();
        String a3 = new String("a3").intern();

        String aa = new String("a1a2a3").intern();

        String a4 = new StringBuilder().append(a1).append(a2).append(a3).toString();

        System.out.println(aa == a4);
    }
}
