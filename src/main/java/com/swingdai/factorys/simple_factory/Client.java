package com.swingdai.factorys.simple_factory;

import com.swingdai.factorys.Product;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 *
 *  简单工厂
 *      这不是一种设计模式，更像是一种编程习惯。将实例化操作单独放在一个类中，该类就称为简单工厂，让工厂
 *      来决定应该用那个具体子类实例化。
 *      使客户端与具体子类实现解耦。客户端无需知道子类细节，增加新的子类也不会导致客户端代码的修改。
 */
public class Client {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product productA = simpleFactory.createProduct(1);
    }
}
