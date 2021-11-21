package org.example.Builder.Case1;

/**
 * 具体产品实现类与产品类依赖
 * 设置MACComputer具体特征
 */
public class MacComputerBuilder extends ComputerBuilder {
    private Computer computer = null;

    public MacComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount("2个雷电接口");
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("原彩显示屏");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
