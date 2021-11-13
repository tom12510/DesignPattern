package org.example.Mediator;

/**
 * 同事类实现接口 (父类依赖中介)
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
