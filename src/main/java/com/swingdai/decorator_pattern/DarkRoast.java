package com.swingdai.decorator_pattern;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 *
 *  具体组件
 *  darkRoast 深度烘焙咖啡
 */
public class DarkRoast implements Beverage{
    @Override
    public double cost() {
        return 1;
    }
}
