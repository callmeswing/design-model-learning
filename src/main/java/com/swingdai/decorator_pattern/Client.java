package com.swingdai.decorator_pattern;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 *
 *  装饰器模式 - 结构型
 *
 *      意图：
 *      动态的为类添加功能
 *
 *      类图解析： 有点套娃的意思
 *      接口Component
 *      具体组件ConcreteComponent、装饰器Decorator 均继承自组件
 *      具体组件不依赖其他对象 处于装饰链的最底层
 *      装饰器组合一个组件 从而可以装饰其他装饰者or具体组件
 *
 *      示例：
 *      饮品添加不同配料 每添加一种配料 价格随之增加
 *
 *      设计原则：
 *          开闭原则 - 类应当对扩展开放，对修改关闭。即添加新功能时无需修改原代码。
 *              不可能将所有类设计为满足这一原则，应在最有可能发生改变的模块遵循这项原则。
 *
 */
public class Client {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println("金额： " + beverage.cost());
    }
}
