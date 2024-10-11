package com.swingdai.chian_of_responsibility;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 *
 *  具体处理器1
 */
public class ConcreteHandler1 extends Handler{

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request == null) {
            return;
        }
        if (request.getType() == RequestType.type1) {
            System.out.println(request.getName() + "  is done by ConcreteHandler1");
            return;
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
