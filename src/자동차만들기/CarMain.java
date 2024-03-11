package 자동차만들기;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        final int[] dist = {0, 400, 150, 200, 300};
        Car car = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 [1]부산 [2]대전 [3]강릉 [4] 광주 : ");
        int city = sc.nextInt();
        System.out.print("이동할 승객 수 : ");
        int passCnt = sc.nextInt();
        System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carSel = sc.nextInt();
        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();
        boolean isMode = (option == 1) ? true : false;
        switch (carSel) {
            case 1 : car = new SportsCar("포르쉐 911"); break;
            case 2 : car = new Sedan("제네시스 G80"); break;
            case 3 : car = new Bus("고속버스"); break;
            default: System.out.println("차량 선택이 잘 못 되었습니다.");
        }
        car.setMode(isMode); // 모드 ON/OFF
        int moveCnt = car.getMovingCnt(passCnt); // 승객의 수로 이동 횟수 구하는 메서드
        System.out.println("=".repeat(7) + car.getName() + "=".repeat(7));
        System.out.println("총 비용 : " + car.getTotalCost(dist[city], moveCnt));
        System.out.println("총 주유 횟수 : " + car.getRefuelCnt(dist[city], moveCnt));
        System.out.println("총 이동 시간 : " + car.getMovingTime(dist[city], moveCnt));
    }
}