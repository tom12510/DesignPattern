package org.example.Chain.Case1;

import org.junit.Test;

import java.util.ArrayList;

public class Client {
    @Test
    public void IWomenTest() {
        //随机挑选几个女性

        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(1, "我要出去逛街"));
        }
        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();

        for (IWomen women : arrayList) {
            if (women.getType() == 1) { //未结婚少女，请示父亲
                System.out.println("\n--------女儿向父亲请示-------");
                father.HandleMessage(women);
            } else if (women.getType() == 2) { //已婚少妇，请示丈夫
                System.out.println("\n--------妻子向丈夫请示-------");
                husband.HandleMessage(women);
            } else {
                //暂时什么也不做
            }
        }
    }
}
