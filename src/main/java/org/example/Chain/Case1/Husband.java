package org.example.Chain.Case1;

/**
 * 请求获取类B
 */
public class Husband extends Handler {


    public Husband(int level) {
        super(level);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("Husband : yes" + women.getRequest());
    }
}
