package org.example.Chain.Case2;

public class Client {
    public static void main(String[] args) {
        //声明所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        //设置链中的阶段顺序1-->2-->3
        handler1.setNext(handler2);

        //提交请求，返回结果
        Response response = handler1.handMessage(new Request());
    }
}
