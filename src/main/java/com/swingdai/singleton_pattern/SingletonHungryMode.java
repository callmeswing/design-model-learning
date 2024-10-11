package com.swingdai.singleton_pattern;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 *
 *  饿汉模式 <线程安全>
 *      初始化时直接创建单例
 *          适合单例对象占用内存小、初始化快的情况 (相较于懒汉模式 丢失了延迟实例化带来的节约资源的好处)
 */
public class SingletonHungryMode {

    private static SingletonHungryMode instance = new SingletonHungryMode();

    private SingletonHungryMode() {
    }

    public static SingletonHungryMode getInstance(){
        return instance;
    }
}
