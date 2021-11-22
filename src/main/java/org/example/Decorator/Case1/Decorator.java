package org.example.Decorator.Case1;

/**
 * 抽象者装饰者
 */
public class Decorator extends Component {

    private Component component = null;

    // 依赖于Component (静态代理)
    public Decorator(Component component) {
        this.component = component;
    }

    // 委托给被修饰者执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
