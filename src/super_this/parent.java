package super_this;

public class parent {
	
	
	
	public int A =40;
	
	public int B= 50;
	
		
    public  int C= 60;
	
	
	public int m1(int A,int B,int C) {
		
		int sum=this.A+this.B+this.C;
		
		return sum;
	}
	 
	


public parent (String str1,String str2){
	
	String ft = "get";
	
	String gf = "the things ";
	
	System.out.println(str1.concat(str2));
}
}