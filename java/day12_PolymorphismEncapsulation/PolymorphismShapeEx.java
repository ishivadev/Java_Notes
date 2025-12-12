package day12_PolymorphismEncapsulation;

class Shape {
	
    void draw() {		// draw method
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
	
    void draw() {		// Same method different implementation
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
	
    void draw() {		// Same method different implementation
        System.out.println("Drawing a rectangle");
    }
}


public class PolymorphismShapeEx {

	    public static void main(String[] args) {
	    	
	        Shape s1 = new Circle();
	        Shape s2 = new Rectangle();

	        s1.draw();  // Drawing a circle
	        s2.draw();  // Drawing a rectangle
	    }
}


