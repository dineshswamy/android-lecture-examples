class Women extends Human {

	public String name;
	public String color;
	int height;

	public Women(String w_name,String w_color,int w_height){
		name  = w_name;
		color = w_color;
		height = w_height;
	}

	public void display()
	{
		System.out.println("Women height="+height+" color="+color);
		System.out.println("No of : eyes="+no_of_eyes+" Hands="+no_of_hands);
	}

	public static void main(String args[])
	{	
		Women women = new Women("marissa","red",23);
		women.display();
	}	
}