package 토커나이저;
import java.util.Scanner;
import java.util.StringTokenizer;

// StringTokenizer : 문자열이 특정 구분자로 연결되어 있는 경우,
// 구분자 기준으로 잘라서 새로운 문자열 생성
public class StringTokenEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 : ");
        String names = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(names, "/");
//        String[] nameStr = new String[st.countTokens()]; // 남아 있는 토큰 수
//        int idx = 0;
//        while (st.hasMoreTokens()) { // 남아 있는 토큰이 있는지 여부 확인
//            nameStr[idx++] = st.nextToken(); // 토큰을 하나씩 꺼내옴
//        }
        String[] nameStr = names.split("/");
        for(String e : nameStr) System.out.print(e + " ");
    }
}
