import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebElement;

public class Regularexp {
	
	public static void main(String[] args) {
		/*	String str1="gfuaygsufags123";
		  String str2="HFJJFHBJDBF233";
		  
		
		
		System.out.println("with regular expression:"+str1.replaceAll("[^0-9]", " "));
		System.out.println("with out regular exppression:"+ str2.replaceAll("[0-9]", ""));
	
	
	
	
	String s1="I love my india";
	
	String[] str=s1.split(" ");
	
			 for(String s:str) {
		    	    char[] c =s.toCharArray();
		    	    System.out.println(c[0]);
		      }
	     
	
		
       int[] arr= {1,3,4,3,2,1,5,4,9,8};
            
       Set<Integer> set = new HashSet<>();
                  
              for (int r:arr) {
            	  set.add(arr[r]);  
    	   
             }
              
              System.out.println(set);
    	   
       }
       */
       
       String str ="good morning";
        String res="";
       for(int i=str.length()-1;i>=0;i--) {
    	   
    	     char mychar =str.charAt(i);   
    	    
    	     res=res+mychar;
    	   
       }
    	   System.out.println(res);
    	   
       }
       
		
	
	
	
	
	
	
	
	
	
	  }
	
	


     


