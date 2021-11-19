package org.example.Chain.Case1;

/**
 * 合并请求处理
 */
public abstract class Handler {
    /**
     * 设置优先级
     */
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;

    private int level = 0;
    //责任传递 下一个能处理的请求
    private Handler nextHandle;

    public Handler(int level) {
        this.level = level;
    }

    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandle != null) {
                this.nextHandle.HandleMessage(women);
            } else {
                System.out.println("不处理");
            }
        }
    }

    public void setNext(Handler handler) {
        this.nextHandle = handler;
    }

    //子类实现具体响应
    protected abstract void response(IWomen women);
}
