package baekjoonP;

import java.util.Scanner;

public class B11170 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		String str = "";
		
		for (int i = 0; i < test; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			str += zeroCount(n, m) + "\n";
			
		}
		
		System.out.println(str);
		
	}
	
	public static int zeroCount(int n, int m) {
		int count = 0;
		
		for (int i = n; i <= m; i++) {
			String ntom = i + "";
			
			if(ntom.contains("0")) {
				
				count += ntom.length() - ntom.replace(String.valueOf('0'), "").length();
				
			}
			
		}
		
		
		return count;
	}
}
