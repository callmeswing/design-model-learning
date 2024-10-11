package com.swingdai.chian_of_responsibility;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 *
 *  请求
 */
public class Request {

    private RequestType type;

    private String name;

    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }

    public RequestType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
