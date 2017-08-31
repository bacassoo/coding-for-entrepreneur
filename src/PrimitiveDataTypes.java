/**
 * boolean(true & false)
 *
 * 숫자
 * byte(-128~127)
 * short(-32,768~32,767)
 * int(
 * long
 * float
 * double
 *
 * 문자
 * char
 * string
 *
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */
public class PrimitiveDataTypes {
    public void explainInteger() {
        int number1 = 3;
        int number2 = 4;
        number1 = 5;
        // number1 = 3.5;
        System.out.println(number1);
    }
    public void explainDouble() {
        double number1 = 7.0;
        double number2 = 2.0;
        System.out.println(number1 / number2);
    }
    public void castNumber() {
        double number1 = 3.5;
        int number2 = (int) number1;
        System.out.println(number2);
    }
    public void explainString() {
        String text1 = "hello";
        String text2 = "Spear";
        System.out.println(text1+" " + text2);
    }
    public void perseData() {
        String numberText = "1";
        int number = 2;
        System.out.println(numberText + number);
        System.out.println(Integer.valueOf(numberText) + number);
        System.out.println(number + " " + "hello");
    }
}

