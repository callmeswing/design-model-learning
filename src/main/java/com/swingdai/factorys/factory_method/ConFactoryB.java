package com.swingdai.factorys.factory_method;

import com.swingdai.factorys.ConProductB;
import com.swingdai.factorys.Product;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 */
public class ConFactoryB extends Factory{
    @Override
    Product factoryMethod() {
        return new ConProductB();
    }
}
