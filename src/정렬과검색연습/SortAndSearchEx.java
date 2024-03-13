package 정렬과검색연습;
import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 개수 : ");
        int num = sc.nextInt();
        System.out.print("찾을 수 입력 : ");
        int[] arr = new int[num];
        int key = sc.nextInt(); // 검색할 키 값
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * num) + 1);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, key));
    }
}
