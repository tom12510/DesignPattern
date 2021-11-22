package org.example.Decorator.Case1;

/**
 * 具体实现类(实际执行逻辑)
 */
public class ConcreateComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do SomeThing");
    }
}
