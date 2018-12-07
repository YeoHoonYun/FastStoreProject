package kr.yun.store;

public class storeMain {
    String StoreName;
    int TotalPrice;

    public void storeMain(String name){
        this.StoreName = name;
    }

    public void storeJoin(){
        System.out.println(this.StoreName+" 가게에 입장하였습니다.");
    }

    public void storeBuy(String name){
        System.out.println(name+"을 물건을 샀습니다.");
    }

    public void storeSell(){
        System.out.println("모든 물건을 계산합니다.");
        System.out.println("총 액 : " + TotalPrice);
    }

    public void storeExit(){
        System.out.println(this+"가게에 나왔습니다.");
    }
}
