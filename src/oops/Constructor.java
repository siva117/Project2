package oops;

public class Constructor {

	public static void main(String[] args) {
		
		String s="style";
		
//		Constructor t = new Constructor("jskjb","ckhbsb");
			        
//		           Constructor tg  =new Constructor (23,56);
//		           Constructor i = new Constructor (8,"pichak");
	              Constructor k  = new Constructor(67.7,7.9);
		           
	}
	
	public  Constructor() {
		
		System.out.println("zero argumented constructor");
	}
	
	
	public Constructor(double d,double e) {
		
		System.out.println("its parameterized constructr");
	}
	
	
	private Constructor(String str, String str2) {
	
	System.out.println("String argumented constructor");
	}
	
	Constructor (double e,float t){
		System.out.println("double args constructor");
	}
	
	
	public Constructor (int a, String c){
		
		System.out.println("concat int and String");
		
	}
	
	public void m1() {
		
		System.out.println("add it");
		
		
		
	}}
	

