/**
 * access modifiers; public; protected; (default), private
 */

public class AccessModifiers {
    private int a;
    private int b;

    public AccessModifiers(int a, int b) {
        this.a = a; // 클래스에 있는 정보를 가져오겠다
        this.b = b;
    }
    public int sum() {
        return a + b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
