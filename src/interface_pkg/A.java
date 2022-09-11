package interface_pkg;

public class A implements I1,I2{

	@Override
	public void m1() {
		
		System.out.println("i am in m1");
	}

	@Override
	public void m2() {
		
		System.out.println("i ma in m2");
	}

	@Override
	public void m3() {
	
		System.out.println("i am in m3");
	}

	@Override
	public int m4 (int a , int b) {
		 int res = a*b;
		System.out.println("i am in m4");
		
		  return res;
	}

	@Override
	public String m5(String c ,String d) {
				
		String str = c.concat(d);
		return str;
	}

	@Override
	public void m6() {
	
	System.out.println("i ma in m6");	
	}

	@Override
	public void m7() {
		
	}

	@Override
	public Void m8() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void m9() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m10() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m18() {
		System.out.println("i am in m18");
		
	}

}
