package abc;

public class Accessing_Im_Sm {
	
	int a=5;
	static int b=10;
	void display()
	{
		System.out.println("instance method content");
	}
	static String display1()
	{
		return "static method content";
	}

	public static void main(String[] args) {
		
		 Accessing_Im_Sm a1=new  Accessing_Im_Sm();
		 System.out.println("accessing instance variable"+" "+a1.a);
		 System.out.println("accessing static variable"+" "+Accessing_Im_Sm.b);
		 a1.display();
		 System.out.println(Accessing_Im_Sm.display1());
		 
		 
		

	}

}
