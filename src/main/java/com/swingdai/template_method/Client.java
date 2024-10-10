package com.swingdai.template_method;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 */
public class Client {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("--------------");

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
