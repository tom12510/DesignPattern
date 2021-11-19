package org.example.Observer.Case3;

import java.util.Observable;
import java.util.Random;

/**
 * 基于Java 接口实现被观察者
 * @link 原文链接：https://blog.csdn.net/u012250875/article/details/77747878
 *
 */
public class Clown extends Observable {
    /**
     * 表演的精彩
     */
    public static final int PERFORM_GOOD = 0;
    /**
     * 表演的糟糕
     */
    public static final int PERFORM_BAD = 1;
    /**
     * 表演完毕
     */
    public static final int PERFORM_COMPLETE = 2;


    /**
     * 表演
     */
    public void perform() {
        System.out.println("**小丑开始表演**");

        int random = new Random().nextInt(2);
        //小丑表演状态是随机值，0表演的好，1表演的差
        switch (random) {
            case PERFORM_GOOD:
                System.out.println("**小丑状态很好，表演的很精彩！**");
                break;
            case PERFORM_BAD:
                System.out.println("**小丑状态不好，出了点篓子！**");
                break;
        }
        // 改变
        super.setChanged();
        //通知信息
        super.notifyObservers(random);
    }

    /**
     * 表演结束,小丑退场
     */
    public void exit() {
        System.out.println("**表演结束，小丑退场！**");
        super.setChanged();
        //退场消息通过该参数传递到观众的update方法的第二个参数上
        super.notifyObservers(PERFORM_COMPLETE);
    }

}
