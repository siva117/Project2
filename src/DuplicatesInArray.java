import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {

		
		 int [] array= {2,4,2,4,5,7,5};
		 Set<Integer> set=new HashSet<Integer>();
		 for(int i=0;i<array.length;i++)
		 {
			 set.add(array[i]);
		 }
		 System.out.println(set);
	}

}
