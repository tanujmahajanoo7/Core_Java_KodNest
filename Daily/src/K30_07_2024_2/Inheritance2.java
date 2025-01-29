package K30_07_2024_2;

class Demo
{
	int a=100;
	void display1()
	{
		System.out.println(a);
	}
}

class Demo1 extends Demo
{
	int b=200;
	void display2()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

class Demo3 extends Demo
{
	int c=300;
	void display3()
	{
		System.out.println(a);
		System.out.println(c);
	}
}

class Demo4 extends Demo
{
	int d=400;
	void display4()
	{
		System.out.println(a);
		System.out.println(d);
	}
}

public class Inheritance2 
{
	public static void main(String[] args) 
	{
		Demo4 d4 = new Demo4();
		Demo3 d3 = new Demo3();
		Demo1 d1 = new Demo1();	
		d4.display4();
		d3.display3();
		d1.display1();
	}
}
