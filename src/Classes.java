/**
 * why?
 * constructor
 * inheritance
 */
public class Classes {
    int a;
    int b;

    public Classes(int a, int b) {
        this.a = a; // 클래스에 있는 정보를 가져오겠다
        this.b = b;
    }
    public int sum() {
        return a + b;
    }
    public int multiply() {
        return a * b;
    }
}

class SubClasses extends Classes { //자식클래스
    public SubClasses(int a, int b) {
        super(a, b);      //상위 클래스 정보를 가져오겠다
    }

    @Override //sum 입력하면 오버라이드로 자동 변경 - 위에 중복이라 자동으로 가져옴
    public int sum() {
        //return super.sum(); // 위와 동일한 기능을 복사해옴
        return a + b + 100; // 기능 추가 + 100
    }
    public int substract() {
        return a - b;
    }
    public int divide() {
        return a / b;
    }
}