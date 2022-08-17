package baekjoonP;

import java.util.HashMap;
import java.util.Scanner;

public class B1235 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		String[] number = new String[n];
		HashMap<String, Boolean> numberSet = new HashMap<>();
		int numLength;
		
		
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			number[i] = sc.next();
			numLength = number[i].length();
			for (int j = 0; j < numLength; j++) {
				String addNum = number[i].substring(numLength - (1+j));
				
				if(numberSet.get(addNum) == null) {
					numberSet.put(addNum, true);
				
				}else if(numberSet.get(addNum)){
					if(max < addNum.length()) {
						max = addNum.length();
					}
					
					numberSet.put(addNum, false);
					continue;
					
				}
				
			}
		}
		
		System.out.println(max + 1);
		
		
	}
}
