/**
 * 성적나누기
 * 구현 내용
 •가장 상단에 변수를 하나 선언하고, 0~100의 숫자를 하나를 부여합니다.
 •점수를 A, B, C, F 구간 별로 나누고, print 함수를 통해 결과를 출력합니다.

 힌트
 •if를 사용합니다.

 마감시간
 •이번 주 일요일 18:00
 •깃허브에 업로드하고 공지 채팅방에 깃허브 링크 공유해주세요.

 */
public class Project1 {
    public void Score() {
        int myScore = 80;
        if (myScore >= 90) {
            System.out.println("Your score is A");
        } else if(myScore >= 80) {
            System.out.println("Your score is B");
        } else if(myScore >= 70) {
            System.out.println("Your score is C");
        } else if(myScore >= 60) {
            System.out.println("Your score is D");
        }
    }
}
