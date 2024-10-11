package com.swingdai.chian_of_responsibility;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 *
 *  责任链模式 - 行为型
 *
 *      意图：
 *      使请求处理对象形成一条链，链中对象都可能对请求进行处理。
 *      沿着这条链发送该请求，直到有对象处理为止。
 *      避免请求发送者与接收者之间的耦合。
 *
 *      类图解析：
 *      Handler抽象类
 *          组合一个Handler(下一个 用于组成处理链 有点类似与装饰器)
 *          handleRequest抽象方法 处理请求
 *      ConcreteHandler具体请求处理器
 *          继承自Handler
 *          多个ConcreteHandler组成一条链
 *
 *
 */
public class Client {

    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);

        Request request1 = new Request(RequestType.type1, "request1");
        Request request2 = new Request(RequestType.type2, "request2");

        handler2.handleRequest(request1);
        handler2.handleRequest(request2);
    }
}
