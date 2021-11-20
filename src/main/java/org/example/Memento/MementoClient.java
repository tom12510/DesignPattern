package org.example.Memento;

import org.example.Memento.Case1.Boy;
import org.example.Memento.Case1.Caretaker;
import org.example.Memento.Case1.Memento;
import org.example.Memento.Case2.Originator;
import org.junit.Test;

public class MementoClient {
    @Test
    public void testCase1(){
        Boy boy = new Boy();
        boy.setState("is ok");
        //记录当前状态
        Memento memento = boy.createMemento();
        //改变状态
        boy.changeState();
        System.out.println(boy.getState());

        //失败
        boy.restoreMemento(memento);

        System.out.println(boy.getState());
    }

    @Test
    public void testCase2(){
        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();
        boy.setState("i`am fine");
        //创建备份
        caretaker.setMemento(boy.createMemento());
        //执行操作
        boy.changeState();
        System.out.println(boy.getState());

        //执行失败 回滚
        boy.restoreMemento(caretaker.getMemento());

        System.out.println(boy.getState());
    }

    @Test
    public void testCase3(){
        Originator originator = new Originator();
        originator.setState("init");
        System.out.println(originator.getState());

        originator.createMemento();

        originator.setState("method");
        System.out.println(originator.getState());

        originator.restoreMemento();

        System.out.println(originator.getState());
    }
}
