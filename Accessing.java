package abc;

class Normal
{
	
String bats_man="virat Kohil";
static String bowler="boomeran";
void display()
{
 System.out.println("hello");
}
static String display1()
{
 return "cricket";
}
}

public class Accessing {

	public static void main(String[] args) {
		int a=10;
	    Approch1 a1=new Approch1();
	    System.out.println(a);
	    System.out.println(a1.bats_man);
	    System.out.println(Normal.bowler);
	    a1.display();
	    System.out.println(Normal.display1());

	}

}
