package com.Test;

public class Impclass implements Service {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("This is default Hello");
	}
	
	public String sayHello(String name) {
		return "Hello from git :"+name;
		// TODO Auto-generated method stub
		
	}

}
