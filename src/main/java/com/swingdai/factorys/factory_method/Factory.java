package com.swingdai.factorys.factory_method;

import com.swingdai.factorys.Product;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 *
 *  工厂方法
 *      定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。
 */
public abstract class Factory {

    abstract Product factoryMethod();
}
