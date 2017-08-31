
public class FavoriteFood {
    public void caseOne() {
        System.out.println("나는 치킨을 좋아합니다.");
    }
    public void caseTwo(String str) {
        System.out.println("나는 "+ str + "을 좋아합니다.");
    }
    public String caseThree() {
        return ("나는 치킨을 좋아합니다");
    }
    public String caseFour(String a) {
        return ("나는" + " " + a + "을" + " " + "좋아합니다");
    }
}
