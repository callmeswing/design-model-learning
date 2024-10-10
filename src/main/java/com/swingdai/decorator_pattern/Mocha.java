package com.swingdai.decorator_pattern;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 *
 *  具体装饰器
 *  抹茶
 */
public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1;
    }
}
