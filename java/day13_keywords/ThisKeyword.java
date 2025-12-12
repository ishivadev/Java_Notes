package day13_keywords;

/*
this - this refers to the current class object — it differentiates between class variables and local variables having the same name.
Without this, Java would confuse which variable to use.
 */


public class ThisKeyword {
	
	// class/instance level variable
	int x;
	int y;
	
	/*
	// This in Constructor
	ThisKeyword(int x, int y)	// local variables
	{
		this.x = x;
		this.y = y;
	}
	*/
	
	// This in Method
	void setValue(int x, int y)	// local variables
	{
		this.x = x;
		this.y = y;
	}
	
	
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		
		//ThisKeyword kw = new ThisKeyword(4, 5);		

		ThisKeyword kw = new ThisKeyword();
		
		kw.setValue(20, 30);
		
		//kw.x = 5;
		//kw.y = 5;
		
		kw.display();
	}

}
