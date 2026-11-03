package com.example.demo;

public class ABuilder {
	int a;
	int b;
	public ABuilder() {
		
	}
	public int getA() {
		return a;
	}
	
	public ABuilder setA(int a) {
		this.b=b;
		return this;
	}
	
	public ABuilder setB(int b) {
		this.b=b;
		return this;
	}
	
	public A build() {
		A a1=new A();
		a1.setA(this.a);
		a1.setB(this.b);
		return a1;
	}
	
	
}
