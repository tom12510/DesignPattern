package org.example.Builder;

public class Client {
    public static void main(String[] args) {
        //   常用创造模式
        Computer build = new Computer.Builder("Inter 10", "16G")
                .setKeyboard("keyboard")
                .setDisplay("原彩显示器")
                .setUsbCount("USB2010")
                .build();
        System.out.println(build);


        ComputerDirector director=new ComputerDirector();

        Computer computer = director.makeMacComputer();
        System.out.println(computer);
    }
}
