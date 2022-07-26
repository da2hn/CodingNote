package baekjoonP;

import java.util.Scanner;

public class B1316 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(check()) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}
	
	public static boolean check() {
		
		boolean[] check = new boolean[26];
		String str = sc.next();
		int prev = 0; //이전 알파벳
		
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i); //현재 알파벳
			
			if(prev != now) {
				
				if(!check[now - 'a']) { 
					check[now - 'a'] = true;
					prev = now;
				
				}else {
					return false;
					
				}
				
		}
		
	}
		return true;
}
}
