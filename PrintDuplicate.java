package Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class PrintDuplicate {
	public static void main(String[] args) {
		
		List<Integer>list= Arrays.asList(1,2,4,5,1,4,8,9);
		HashSet<Integer>set= new HashSet<>();
		
		for(Integer no: list)
			if(!set.add(no)) {
				System.out.println("Duplicate Nos: "+ no);
			}
		
	}
	
}
