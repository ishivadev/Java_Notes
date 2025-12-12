package practiceQuestions;

class Bike{
	int speedlimit=90;

	final void start(){
		System.out.println(speedlimit);
		System.out.println("inside of Bike");
        }
}

class Honda3 extends Bike{
	int speedlimit=150;

	/*
	public void start(){
		System.out.println(speedlimit);
		System.out.println("inside of Bike");
        }
       */
}


public class TrickyQuestion1 {
	
	public static void main(String args[]){
		Bike obj=new Honda3();
		System.out.println(obj.speedlimit);	

		obj.start();	
	
	}	
}
