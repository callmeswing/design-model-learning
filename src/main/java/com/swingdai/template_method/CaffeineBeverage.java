package com.swingdai.template_method;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-11
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("boil water...");
    }

    void pourInCup(){
        System.out.println("pour in cup...");
    }
}
