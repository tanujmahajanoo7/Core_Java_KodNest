package ConstructorChanning3;

class Demo {
	int a;
	int b;
	String c;
	
	public Demo() {
		a = 10;
		b = 20;
		c = "Omkar";
	}
	
	public Demo(int a) {
		this.a = a;
	}
	
	public Demo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Demo(int a, int b, String c) {
		this();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}	
}

class Demo1 extends Demo{
	int x;
	int y;
	
	public Demo1() {
		x = 100;
		y = 200;
	}
	
	public Demo1(int x) {
		this.x=x;
	}
	
	public Demo1(int x,int y) {
		super(101,102,"Rahul");
		this.x=x;
		this.y=y;
	}
	
	public void display2() {
		System.out.println(a + " " + b + " " + c);
		System.out.println(x + " " + y + " ");	
	}
}


public class ChainingApp3 {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1(10,20);
		d1.display2();
	}
}
