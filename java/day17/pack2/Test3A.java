package day17.pack2;

import day17.pack1.Test1;	// imported package

public class Test3A extends Test1{		// inherit

	public static void main(String[] args) {
		
		Test3A tsObj = new Test3A();	// created object child and access the variable and method for parent class which is extends in child class
		
		System.out.println( tsObj.x );	// calling protected variable
		tsObj.m2();		// calling protected method

	}

}
