package org.example.Observer.Case1;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        Spy breakFast = new Spy(hanFeiZi, liSi, "breakFast");
        breakFast.start();


        hanFeiZi.haveBreakfast();

        hanFeiZi.haveFun();
    }
}
