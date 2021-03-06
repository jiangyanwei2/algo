package com.jyw.singleton;
//饿汉模式
//类加载时就会被创建，不管实例对象有没有被用到
public class Singleton1 {
	
	private static Singleton1 instance = new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return instance;
	}

}
