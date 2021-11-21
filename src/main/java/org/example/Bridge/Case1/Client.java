package org.example.Bridge.Case1;

public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("-------房地产公司是这样运行的-------");
        // 定义房产公司
        HouseCorp houseCorp = new HouseCorp(house);
        // 房产公司赚钱模式
        houseCorp.makeMoney();

        System.out.println("-------山寨公司是这样运行的-------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();

    }
}
