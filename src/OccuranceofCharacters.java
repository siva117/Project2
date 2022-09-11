import java.util.HashMap;

public class OccuranceofCharacters {
	public static void main(String[] args) {
		
		
		String str ="Alluuu Arrrjun";
		
		HashMap<Character,Integer> Allch= new HashMap<>();
		
		for(int i=0;i<=str.length()-1;i++) {
			
			       char mych=str.charAt(i);
			       
			     if(Allch.containsKey(mych)) {
			    	 
			    	   int currentvalue =Allch.get(mych);
			    	   currentvalue++;
			    	   Allch.put(mych, currentvalue);
			    	    
			     }
			     else {
			    	 Allch.put(mych, 1);
			    	 
			     }
			       
			      
		}
		 System.out.println(Allch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
