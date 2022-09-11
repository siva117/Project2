package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapobject {

	public static void main(String[] args) {
		
		
	/*	HashMap<String,String> val0 = new HashMap<>();{
			val0.put("take", "one");
			val0.put("get", "two");
			val0.put("achive", "all");
		}
	
		HashMap<String,String> val = new HashMap<>();{
			
			
		 /* val.put("name", "siva");
			val.put("id", "213i87");
			val.put("dept", "QA");
			val.put("designation","Test Eng");
			val.put("company", "softwar");
			val.put(null, "done");
			val.put(null,"skj"); //it wont accept two null keys...
			val.put("samp", "");
			
//			System.out.println(val.get("samp"));
			
			val.putAll(val0);
			
//			System.out.println(val.size());
			
			
//			System.out.println(val.containsKey("dept"));
			
//			System.out.println(val.containsValue("skj"));
			
			val.replace("company", "IT");
			
			val.replace("company", "IT", "information technology");
			
			val.remove("dept", "QA");
			System.out.println(val.get("company"));
			
			System.out.println(val.get("dept"));
			
			System.out.println(val);
			*/
/*			
		}
		
		LinkedHashMap<String,String> val1=new LinkedHashMap<>();{
			
			
			val1.put("name", "siva");         //printed based on insertion order
			val1.put("id", "213i87");
			val1.put("dept", "QA");
			val1.put("designation","Test Eng");
			val1.put("company", "softwar");
			
			val1.put(null, "take");
//			System.out.println(val1);
			
			
			TreeMap<String,String> val11=new TreeMap<>();
			
			val11.put("name", "siva");
			val11.put("id", "213i87");
			val11.put("dept", "QA");              // it ll print in sorting order
			val11.put("designation","Test Eng");
			val11.put("company", "softwar");
			val11.put(null, "done");         // its not accepting null key
			
			System.out.println(val11);
			
			System.out.println(val11.get(null));//getting nullponter exeption
			
			
			
		}
	*/	
		     Hashtable <String ,String> va=new Hashtable<>();{
		    	 
		    	    va.put("name", "siva");
					va.put("id", "213i87");
					va.put("dept", "QA");
					va.put("designation","Test Eng");
					va.put("company", "softwar");  //it wont alllow even single null as a key..
//					va.put(null, "done");
					
		    	 System.out.println(va.get("va"));
		    	 
//		    	 System.out.println(va.get(null));
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		     }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
