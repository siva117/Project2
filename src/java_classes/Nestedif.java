package java_classes;

public class Nestedif {
	
	public static void main(String[] args) {
		
		
		String isLegalball = "yes";
		String isInsideball = "yes";
		String isPitchingInside = "yes";
		String isImpactInside  = "yes";
		String isHittingWickets = "yes";
		
		if(isLegalball=="no") {
		   
			if(isInsideball=="no") {
				System.out.println("not out as there is an edge found");
			}else {
				 if(isPitchingInside=="no") {
					 System.out.println("out");}
				  	  
			 else {
					 System.out.println("not out as outside pitch");
				 }
			}
			
		}else {
			System.out.println("Not out as ball is no ball");
		}

	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


