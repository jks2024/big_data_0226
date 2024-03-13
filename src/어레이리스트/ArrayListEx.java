package 어레이리스트;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
// List 인터페이스 : ArrayList, Vector, LinkedList 부모 인터페이스
// List의 특징은 배열과 유사하지만, 동적으로 크기가 변합니다.
// - 요소의 저장 순서 유지
// - 중복 저장 허용
// - 여러가지 메소드 제공
public class ArrayListEx {
    public static void main(String[] args) {
        // asList() 배열을 List로 변환하기 위해 사용
        String[] data = {"138", "129", "142"};
        LinkedList<String> pitches = new LinkedList<>(Arrays.asList(data));
        pitches.add(3, "133");
        System.out.println(pitches);
    }
}