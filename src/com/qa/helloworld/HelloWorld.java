package com.qa.helloworld;

public class HelloWorld {
	
	public static void main(String[] args) {
		
	}
	
public class DataTypes { 
	public void noReturn() {
		System.out.println("No value returned");
	}
	
	public String withReturn() {
		System.out.println("Value returned");
		return "Hello World";
	}
	
	boolean bool = true;
	byte bytes = 8;
	char character = 'A';
	short number = 16;
	int anotherNumber = 32;
	long aLongNumber = 64L;
	float decimalNumber = 3.2f;
	double anotherDecimalNumber = 6.4d;
	
	public int methodName1() {
	    return 0;
	}
	public boolean methodName2() {
	    return true;
	}
	public char methodName3() {
	    return 'P';
	}
	public long methodName4() {
	    return 52L;
	}
	public float methodName5() {
	    return 0.6f;
	}
	public String methodName6() {
	    return "Hi there";
	}
	public void methodName7() {
	    // no return
	}
}

}
