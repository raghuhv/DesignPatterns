package com.singleton;

public class Singleton {

	private static Singleton singleton = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null)
			return singleton = new Singleton();
		else
			return singleton;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());

	}

}
