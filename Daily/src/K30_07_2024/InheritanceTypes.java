package K30_07_2024;

class Demo1
{
	int a=1;
	void display1()
	{
		System.out.println(a);
	}
}

class Demo2 extends Demo1
{
	int b=2;
	void display2()
	{
		System.out.println(b);
	}
}

class Demo3 extends Demo2
{
	int c=3;
	void display3()
	{
		System.out.println(c);
		System.out.println(a+b+c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo3 d3 = new Demo3();
		d3.display1();
		d3.display2();
		d3.display3();

	}

}
