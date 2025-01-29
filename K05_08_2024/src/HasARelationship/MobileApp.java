package HasARelationship;

public class MobileApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Instantiate mobile object 
		Mobile phone=new Mobile(); 
		System.out.println("Mobile Name "+phone.brand); 
		System.out.println("Mobile Color "+phone.color); 
		System.out.println("==========================="); 
		System.out.println("OS NAME "+phone.os.name); 
		System.out.println("OS VERSION "+phone.os.version); 
		System.out.println("======================================"); 
		//Instantiate charger 
		Charger charger=new Charger(); 
		System.out.println("Charger Color "+charger.color); 
		System.out.println("Charger Brand "+charger.brand); 
		System.out.println("Charger Output "+charger.output); 
		System.out.println("======================================"); 
		//Assigining charger to PHONE 
		phone.port(charger); //White Apple 20
		System.out.println("=================================="); 
		//Destroying Phones 
		phone=null; 
		System.out.println("PHONE DESTROYED...KATHAM...TATA BYE BYE GOOD BYE...GAYA...."); 
//		 ERROR System.out.println(phone.os.name); 
//		 ERROR System.out.println(phone.os.version); 
//		 ERROR System.out.println("===================================== ");
		System.out.println(charger.color+" "+charger.brand+" "+charger.output);
	}

}
