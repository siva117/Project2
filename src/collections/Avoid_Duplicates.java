package collections;

import java.util.LinkedHashSet;

public class Avoid_Duplicates {

	public static void main(String[] args) {
		
		 String Name = "sudhanandha";
         
         LinkedHashSet<Character> li= new LinkedHashSet<>();{
         	
           for(int i=0;i<=Name.length()-1;i++) {
         	  
         	        char mychar =Name.charAt(i);
         	         li.add(mychar);
         	        
           }
           
           System.out.println(li);

	}

}
}