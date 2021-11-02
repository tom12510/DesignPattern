package org.example.Flyweight.Case1;

/**
 * 抽象享元角色
 */
public abstract class Flyweight {
    // 内部状态(相同属性)
    private String intrinsic;

    // 外部状态(不同属性) 不允许扩展
    protected final String Extrinsic;

    // 要去享元角色必须接收外部状态
    public Flyweight(String _Extrinsic) {
        this.Extrinsic = _Extrinsic;
    }

    // 业务操作
    public abstract void operate();


    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
