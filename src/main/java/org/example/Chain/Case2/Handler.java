package org.example.Chain.Case2;


/**
 * 抽象处理者
 * 定义请求处理的方法 handleMessage
 * 定义链式
 * 抽象任务echo
 */
public abstract class Handler {
    private Handler nextHandler;

    public final Response handMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handMessage(request);
            } else {
                // 没有适当的处理者
            }
        }
        return response;
    }

    //设置下一个处理者是谁
    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    //每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();

    //每个处理者都必须实现处理任务
    protected abstract Response echo(Request request);
}
