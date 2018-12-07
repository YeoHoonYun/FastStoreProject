package kr.yun.store;

import java.util.Scanner;

public class storeProgram {

    public static void main(String[] args) {
        Scanner scanName = new Scanner(System.in);
        Scanner scanWork = new Scanner(System.in);
        String name, selectNum;

        System.out.print("이름을 입력하세요. : ");
        name = scanName.nextLine();

        userAccount userInfo = new userAccount(name);
        while (true) {
            System.out.println("-----------------");
            System.out.println("| 1. 나의 정보   |");
            System.out.println("| 2. 5000원 벌기 |");
            System.out.println("| 3. 가게 입장   |");
            System.out.println("-----------------");
            System.out.print("작업을 선택하세요.(Q,q => 나가기) : ");
            selectNum = scanWork.next();

            if (selectNum.equalsIgnoreCase("q") || selectNum.equalsIgnoreCase("Q")) {
                break;
            } else if (selectNum.equalsIgnoreCase("1")) {
                userInfo.MyInfo();
            } else if (selectNum.equalsIgnoreCase("2")) {
                userInfo.work();
                System.out.println("현재 잔고 : " + userInfo.account);

            } else if (selectNum.equalsIgnoreCase("3")) {
                storeCar testCar = new storeCar(userInfo);
                userInfo.MyInfo();
            } else {
                System.out.println("값이 유효하지 않습니다.");
            }

        }
        System.out.println("작업이 끝났습니다.");
    }
}
