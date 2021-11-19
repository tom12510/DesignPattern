package org.example.Observer.Case1;

import cn.hutool.core.collection.CollUtil;

import java.util.List;


/**
 * 具体被观察的对象
 */
public class HanFeiZi implements Observable, IHanFeiZi {

    private boolean isHavingBreakfast = false;

    private boolean isHavingFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("HanFeiZi haveBreakfast");
        this.isHavingBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("HanFeiZi haveFun");
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }

    private List<Observer> observables = CollUtil.newArrayList();

    @Override
    public void addObserver(Observer observable) {
     this.observables.add(observable);
    }

    @Override
    public void deleteObserver(Observer observable) {
     this.observables.remove(observable);
    }

    /**
     * 通知所有的观察者
     * @param observable
     */
    @Override
    public void notifyObserver(String context) {
        for (Observer observer : observables) {
            observer.update(context);
        }
    }
}
