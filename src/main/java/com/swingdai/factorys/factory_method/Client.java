package com.swingdai.factorys.factory_method;

import com.swingdai.factorys.Product;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new ConFactoryB();
        Product productB = factory.factoryMethod();
    }
}
