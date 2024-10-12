package com.swingdai.factorys.abstract_factory;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 *
 *  抽象工厂
 *
 *      提供一个接口，用于创建 相关的对象家族。
 *
 *      工厂方法模式只是用于创建一个对象。抽象工厂模式创建的是对象家族，也就是很多对象而不是一个对象，
 *  并且这些对象是相关的，也就是说必须一起创建出来。
 *      抽象工厂模式用到了工厂方法模式来创建单一对象，AbstractFactory中的createProductA()
 *  和createProductB()，这两个方法单独来看就是在创建一个对象，这符合工厂方法模式的定义。
 *      创建对象的家族这一概念是在 Client 体现，Client 要通过 AbstractFactory 同时调用两个方法来创建出两个对象，
 *  在这里这两个对象就有很大的相关性，Client 需要同时创建出这两个对象。
 */
public abstract class AbstractFactory {

    abstract AbstractProductA createProductA();

    abstract AbstractProductB createProductB();

}
