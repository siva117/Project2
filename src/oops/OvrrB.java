package oops;

public class OvrrB extends OvrrA {
	
	
	                       //child class accessmodifier should be >= tothe parent class acc modifier
	
	public void m1() {
		
		System.out.println("i amin m1 method of class ovrrB");
		
	}
		
		public static void m2() {
			System.out.println("i am in method of m2 of class B");
		}
		
		
		
		public int m3(int a , int b) {
			System.out.println("i am in m3 method of class b");
			
			int substraction = a-b;
			
			return substraction;
		
		
	}
             /// return type musst be same as per supoer class
	double  m4(double a,float b) {
	    	 System.out.println("i am in m4 method of class A");
	    	 
	    	double db =a*b;
	    	 
	    	return (float) db; 
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}