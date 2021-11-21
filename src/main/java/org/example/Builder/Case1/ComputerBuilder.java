package org.example.Builder.Case1;

/**
 * 抽象构者类(约束产品相关特性),由它来组件各种产品类型的电脑
 * <p>
 * (子类具体实现)
 */
public abstract class ComputerBuilder {

    public abstract void setUsbCount();

    public abstract void setKeyboard();

    public abstract void setDisplay();




    //产品组装后获取类
    public abstract Computer getComputer();
}
