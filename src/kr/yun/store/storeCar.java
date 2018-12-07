package kr.yun.store;

import java.util.HashMap;
import java.util.Scanner;

public class storeCar extends storeMain {
    HashMap<String, Integer> CarInfo = new HashMap<String, Integer>();
    Scanner ScanCar = new Scanner(System.in);
    Scanner scanStore = new Scanner(System.in);
    String StoreName = "Car 상점";
    String CarName, selectStore;
    int TotalPrice = 0;

    public storeCar(userAccount userInfo){
        CarInfo.put("소나타", 5000);
        CarInfo.put("벤츠", 50000);

        System.out.println(this.StoreName+" 가게에 입장하였습니다.");
        System.out.println("------"+this.StoreName+"------");
        this.outputCar();

        while (true) {
            System.out.println("--------------------");
            System.out.println("| 1. 자동차 목록     |");
            System.out.println("| 2. 자동차 사기     |");
            System.out.println("| 3. 자동차 결제하기 |");
            System.out.println("| 4. 쇼핑 그만하기 |");
            System.out.println("--------------------");

            System.out.print("("+this.StoreName+") 작업을 선택하세요. : ");
            selectStore = scanStore.next();
            if (selectStore.equalsIgnoreCase("q") || selectStore.equalsIgnoreCase("Q")) {
                break;
            } else if (selectStore.equalsIgnoreCase("1")) {
                this.outputCar();
            } else if (selectStore.equalsIgnoreCase("2")) {
                this.outputCar();
                System.out.print("구매할 차 이름을 넣어주세요. : ");
                CarName = ScanCar.nextLine();
                this.storeBuy(CarName);
            } else if (selectStore.equalsIgnoreCase("3")) {
                this.storeSell(userInfo);
            } else if (selectStore.equalsIgnoreCase("4")) {
                this.storeExit();
                break;
            } else {
                System.out.println("값이 유효하지 않습니다.");
            }
        }
    }

    public void outputCar(){
        System.out.println("------------CarInfo-----------");
        for (String key : this.CarInfo.keySet()){
            System.out.println(String.format("| Car : %s, Price : %s |", key, CarInfo.get(key)));
        }
        System.out.println("------------------------------");
        return;
    }

    public void storeJoin(){
        System.out.println(this.StoreName +" 가게에 입장하였습니다.");
    }

    public void storeBuy(String key){
        if (CarInfo.containsKey(key)) {
            System.out.println(key+"을 물건을 샀습니다.");
            this.TotalPrice += CarInfo.get(key);
        }
        else{
            System.out.println("물건이 없습니다.");
        }
    }

    public void storeSell(userAccount userInfo){
        System.out.println("모든 물건을 계산합니다.");
        System.out.println("잔 고 : " + userInfo.account);
        System.out.println("총 액 : " + this.TotalPrice);
        while (true) {
            if (this.TotalPrice > userInfo.account) {
                System.out.println("돈이 없어서 물건을 사지 못합니다.");
                System.out.println("5000원 돈을 빌립니다.");
                userInfo.account += 5000;
                System.out.println("현재 잔고 : " + userInfo.account);
                System.out.println("------------------------------");
            } else {
                System.out.println("물건을 결제합니다.");
                userInfo.account -= this.TotalPrice;
                System.out.println("현재 잔고 : " + userInfo.account);
                System.out.println("------------------------------");
                break;
            }
        }
    }

    public void storeExit(){
        System.out.println(this.StoreName+"가게에 나왔습니다.------");
        return;
    }
}