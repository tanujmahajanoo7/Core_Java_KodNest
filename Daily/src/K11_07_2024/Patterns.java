package K11_07_2024;

public class Patterns {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------69--------------------");
		for(int i=0;i<=4;i++)
		{
			char b=(char)('a'+i);
			for(int j=0;j<=4;j++)
			{
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("--------------------70--------------------");
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				char b=(char)('a'+j);
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("--------------------71--------------------");

		for(int i=0;i<=3;i++)
		{
			int b=0;
			for(int j=0;j<=i;j++)
			{
				b=(b+10);
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("--------------------72--------------------");
		
		int b=0;
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				b=(b+10);
				System.out.print(b+"*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------73--------------------");
		
		b=0;
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				b=(b+10);
				System.out.print(b+"*");
			}
			System.out.println();
		}
		
	}
}


