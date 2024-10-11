package com.swingdai.chian_of_responsibility;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 */
public class ConcreteHandler2 extends Handler{

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request == null) {
            return;
        }
        if (request.getType() == RequestType.type2) {
            System.out.println(request.getName() + "  is done by ConcreteHandler2");
            return;
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
