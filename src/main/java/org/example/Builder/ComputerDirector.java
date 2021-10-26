package org.example.Builder;

/**
 * 具体组装对象类
 */
public class ComputerDirector {
    private ComputerBuilder computerBuilder = new MacComputerBuilder("M1", "16g");


    public Computer makeMacComputer() {
        //使用ComputerBuilder构造出MAC电脑(构造先后逻辑顺序定义)
        computerBuilder.setKeyboard();
        computerBuilder.setUsbCount();
        computerBuilder.setDisplay();
        return computerBuilder.getComputer();
    }
}
