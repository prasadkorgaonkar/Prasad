package Array;

import java.util.Arrays;
import java.util.List;

public class FindPerfectSquare {
	public static void main(String[] args) {
		
		List<Integer>list= Arrays.asList(9,8,15,36,16,20,121);
		for(Integer no:list) {
			int ans= (int)Math.sqrt(no);
			if(ans*ans==no) {
				System.out.println(no);
			}
		}
	}
}
