package org.example.Liskov;

/**
 * 解决方案
 * 创建更继承的基类
 */
class Base {
  // 把基础类方法和成员放到Base类
}

class Liskov_A {
    public int func1(int a, int b) {
        return a - b;
    }
}
/**
 *  子类重写父类方法 违反里氏原则
 *  使其原有逻辑发生改变
 */
class Liskov_B extends Liskov_A {

    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}

