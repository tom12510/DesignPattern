package org.example.Chain.Case1;

/**
 * 请求处理类A
 */
public class Father extends Handler {

    public Father(int level) {
        super(level);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("Father" + women.getRequest() + "yes");
    }
}
