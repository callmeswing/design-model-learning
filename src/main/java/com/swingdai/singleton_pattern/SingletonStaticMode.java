package com.swingdai.singleton_pattern;

/**
 * @author SwingDai
 * @version 1.0
 * @date 2024-10-12
 *
 *  静态内部类模式 <线程安全>
 *          当 SingletonEnum 类加载时，静态内部类 SingletonHolder 没有被加载进内存。
 *      只有当调用 getInstance() 方法从而触发 SingletonHolder.INSTANCE 时
 *      SingletonHolder 才会被加载，此时初始化 INSTANCE 实例。
 *          这种方式不仅具有延迟初始化的好处，而且由虚拟机提供了对线程安全的支持，
 *      实现也相对简单(相较于同样延迟加载、线程安全的懒汉模式而言)
 */
public class SingletonStaticMode {

    private SingletonStaticMode() {
    }

    private static class SingletonHolder {
        private static final SingletonStaticMode INSTANCE = new SingletonStaticMode();
    }

    public static SingletonStaticMode getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
