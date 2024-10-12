package com.swingdai.factorys.simple_factory;

import com.swingdai.factorys.ConProductA;
import com.swingdai.factorys.ConProductB;
import com.swingdai.factorys.ConProductC;
import com.swingdai.factorys.Product;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 */
public class SimpleFactory {

    public Product createProduct(int type) {
        if (type == 1) {
            return new ConProductA();
        } else if (type == 2) {
            return new ConProductB();
        } else if (type == 3) {
            return new ConProductC();
        }
        return null;
    }
}
