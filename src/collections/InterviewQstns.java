package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class InterviewQstns {
	
	public static void main(String[] args) {
		
/*		//how many times character has repeated
	String str = "sudhanandha";
	
	HashMap<Character,Integer> allchars= new HashMap<>();{
		
		for(int i=0;i<=str.length()-1;i++) {
			    char mychar =str.charAt(i);
			    
			    if(allchars.containsKey(mychar)){
			    	int currentvalue = allchars.get(mychar);
			    	    currentvalue++;
			    	    allchars.put(mychar, currentvalue);	
			    }
			
			    else {
			    	
			    	allchars.put(mychar,1);
			    }
			
			       
			
			
		}
		
		System.out.println(allchars);
		
		
		
		
 
	
	                
	  //delete duplicate chars and print unique ones
	            String Name = "sudhanandha";
	            
	            Set<Character> li= new HashSet<>();{
	            	
	              for(int i=0;i<=Name.length()-1;i++) {
	            	  
	            	        char mychar =Name.charAt(i);
	            	         li.add(mychar);
	            	        
	            	  
	              
	              
	              }
	              System.out.println(li);
	            	
	            }
	}
}
	            	
	*/            
	
	           String Name1="sivakrishna";
	           
	           HashMap<Character,Integer> first = new HashMap<>();{
	        	   
	        	   for(int i=0;i<=Name1.length()-1;i++) {
	        		            char mych=Name1.charAt(i);
	        		            
	        		         if(first.containsKey(mych)) {
	        		        	 
	        		          int curvalue = first.get(mych);
	        		        	     curvalue++;
	        		        	     
	        		        	     first.put(mych, curvalue);
	        		         }
	        		         else {
	        		        	     first.put(mych, 1);
	        		         }    
	        		        	     
	        		        	 
	        		         }
	        	   System.out.println(first);
	        		             
	        	   }
	        	   
	        	   
	        	   
	           }
}
	
	
	
	
	
	
	
	
	
	
	
	
	


