package abc;

//Can we override the instance methods --> yes
class A 
{
	void display()
	{
		System.out.println("Instance method of content A");
	}

}
class B extends A 
{
	void display()
	{
		System.out.println("Instance method of content B");
	}

}

public class Instance_method_override {

	public static void main(String[] args) {
		A a1 = new B();
		a1.display();

	}

}
