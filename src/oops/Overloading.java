package oops;

public class Overloading {
	
	
	
	
				
	public static int get(int a , int b) {
	
		int substract= a-b;
		
		return substract;
	}
	
	public static int get(int a,int b, int c) {
		
		int add = a+b-c;
		
		   return add;
	}
	
	public  String get(String str,String str2) {
		
		String word= str.concat(str2);
		
		return word;
	}
	
	 public static double get(double a,int b) {
		 
		 double db=a+b;
	
	 return db;
}
	public static double get(int a, double b) {
		
		double i= a+b;
		return i;
		
	}
	
	
	public int get(int c,int v,int f,int y) {
	int	res = c+v-f+y;
	
	return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	

