package com.example.demo;

public class A {
	int a;
	int b;
	
	public A() {
		
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + "]";
	}
	
}
