package com.swingdai.decorator_pattern;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 *
 *  装饰器 抽象类(持有的被装饰字段用protected修饰！！)
 *  配料装饰器
 */
public abstract class CondimentDecorator implements Beverage{

    protected Beverage beverage;
}
