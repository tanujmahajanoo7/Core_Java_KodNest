package K22_07_2024;

class Professor
{
	String name;   			//null
	int age;   				//0
	String sub;    			//null
	void teach()
	{
		System.out.println("Name of the professor is "+name+" sir . His age is "+age+" and he will teach "+sub);
	}
}

public class obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof = new Professor();
		prof.name="Akash";
		prof.age=40;
		prof.sub="Java";
		prof.teach();
	}
}
