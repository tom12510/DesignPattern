package org.example.Builder.Director;

import org.example.Builder.Builder.ComputerBuilder;
import org.example.Builder.ConcreteBuilder.MacComputerBuilder;
import org.example.Builder.Product.Computer;

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
