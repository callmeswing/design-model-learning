package com.swingdai.decorator_pattern;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 *
 *  具体组件
 *  houseBlender 自调配咖啡
 */
public class HouseBlender implements Beverage{
    @Override
    public double cost() {
        return 1;
    }
}
