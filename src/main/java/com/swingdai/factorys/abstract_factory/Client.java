package com.swingdai.factorys.abstract_factory;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConFactory1();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
        // ...
    }
}
