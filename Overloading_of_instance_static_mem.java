package abc;

public class Overloading_of_instance_static_mem {
	
	
	void sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
	

 void sum(int a,int b,int c )
{
	int d;
	d=a+b+c;
	System.out.println(d);
}
 
 static void mul(int a,int b)
 {
	 int c;
	 c=a*b;
	 System.out.println(c);
 }
 static void mul(int a)
 {
	 int c=2;
	 c=c*a;
	 System.out.println(c);
 }

	public static void main(String[] args) {
	Overloading_of_instance_static_mem a1=new Overloading_of_instance_static_mem();
     a1.sum(1,2);
     a1.sum(1,2,6);
     mul(3,4);
     Overloading_of_instance_static_mem.mul(4);

	}

}

