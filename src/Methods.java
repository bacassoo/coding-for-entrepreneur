/**
 * function & methods
 * why?
 * parameter O / X
 * return value O /x
 */

public class Methods {
    // parameter X / return value X
    public void testMethodOne() {
        System.out.println("method one");
    }
    public void testMethodTwo(String str) {
        System.out.println("method " + str);
    }
    // parameter X / return value O
    public String testMethodThree() {
        return "method three";
    }
    // parameter O / return value O
    public int testMethodFour(int a, int b) {
        return a + b;
    }
}
