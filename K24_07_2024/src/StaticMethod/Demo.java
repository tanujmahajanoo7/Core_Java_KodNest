package StaticMethod;

public class Demo {
	static int a;
	static int b;
	static int c;
	
//	static block
	static 
	{
		a=10;
		b=20;
		c=30;
	}
	
//	static method
	static void display1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
//	Instance variable
	int x;
	int y;
	int z;
	
//	Instance block
	{
		x=100;
		y=200;
		z=400;
		a=400;
		b=500;
		c=600;
	}
	
//	Instance method
	void display2()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}
