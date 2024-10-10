package com.swingdai.template_method;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Coffee brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee add condiments");
    }
}
