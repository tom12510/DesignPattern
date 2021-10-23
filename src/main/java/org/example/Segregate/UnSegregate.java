package org.example.Segregate;

/**
 * 违反接口隔离原则
 *
 */
public interface UnSegregate {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
}

class B implements UnSegregate {
    @Override
    public void operation1() {
        System.out.println("B 实现 Segregate 中 operation1 方法");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现 Segregate 中 operation2 方法");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现 Segregate 中 operation3 方法");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现 Segregate 中 operation4 方法");
    }
}

class D implements UnSegregate {

    @Override
    public void operation1() {
        System.out.println("D 实现 Segregate 中 operation1 方法");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现 Segregate 中 operation1 方法");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现 Segregate 中 operation1 方法");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现 Segregate 中 operation1 方法");
    }
}

/**
 * 客户端A依赖接口UnSegregate(只使用operation1,operation2)
 * 违反接口隔离原则
 */
class A {
    public void depend1(UnSegregate a){
        a.operation1();
    }
    public void depend2(UnSegregate a){
        a.operation2();
    }

}

/**
 * 客户端C依赖接口UnSegregate(只使用operation3,operation4)
 * 违反接口隔离原则
 */
class C {
    public void depend3(UnSegregate a){
        a.operation3();
    }

    public void depend4(UnSegregate a){
        a.operation4();
    }

}

