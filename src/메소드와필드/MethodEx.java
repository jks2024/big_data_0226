package 메소드와필드;

public class MethodEx {
    public static void main(String[] args) {
        say("곰돌이사육사"); // 메소드 호출, 매소드는 선언이 되어 있더라도 호출하지 않으면 동작하지 않음
        int rst = sum(1,2,3,4,5,6,7,8,9);
        System.out.println(rst);
    }
    // 메소드 앞에 static을 사용하는 경우는 클래스 메소드라고 하며, 객체로 생성되지 않음
    // 매개변수의 개수를 모르는 경우
    static int sum(int ... values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
    //반환 타입 없음
    static void say(String name) { // 함수에서는 매개변수를 정수로 선언 했는제 문자열로 입력한 경우
        System.out.println("Hi........" + name);
    }
    // 재귀 호출

}
