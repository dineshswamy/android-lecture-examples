import java.util.*;
class Man implements SuperMan
{
	int height;
	int weight;
	String name ;
	
	public Man(int height,int weight,String name){
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	public void fly()
	{
		System.out.println("I m flying");
	}
	public void runFaster()
	{
		System.out.println("I m running really faster");	
	}

	public static void main(String args[])
	{
		Man man = new Man(23,65,"Andy rubin");
		man.fly();
		man.runFaster();
	}

}

