package com.swingdai.template_method;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 */
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea add condiments");
    }
}
