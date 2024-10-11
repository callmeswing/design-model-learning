package com.swingdai.chian_of_responsibility;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 *
 *  处理器抽象类
 */
public abstract class Handler {

    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);
}
