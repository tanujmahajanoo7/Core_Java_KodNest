package K11_07_2024;

public class PatternGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch='A';
		for(int i=43;i<69;i++)
		{
			System.out.println("System.out.println(\"--------------------"+i+ch+"--------------------\");");
			System.out.println();
			System.out.println();
			ch=(char)(ch+1);
		}
	}
}
