package kr.yun.store;

public class userAccount {
    String name;
    int account = 0;

    public userAccount(String name){
        this.name = name;
    }

    public void MyInfo(){
        System.out.println("------------------------------");
        System.out.println("이름 : " + this.name);
        System.out.println("자금 : " + this.account);
        System.out.println("------------------------------");
    }

    public void work(){
        this.account += 5000;
        System.out.println("5000원을 벌었습니다.");
    }

}
