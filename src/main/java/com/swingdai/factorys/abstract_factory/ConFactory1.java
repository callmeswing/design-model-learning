package com.swingdai.factorys.abstract_factory;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 */
public class ConFactory1 extends AbstractFactory{
    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
