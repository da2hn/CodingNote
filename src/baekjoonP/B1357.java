package baekjoonP;

import java.util.Scanner;

public class B1357 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int revNum = rev(rev(x) + rev(y));
		
		System.out.println(revNum);
		
	}
	
	public static int rev(int num) {
		
		String newNum = "";
		
		while(num >= 10) {
			
				newNum += num % 10;
				num = num / 10;
		}

		newNum += num;
		
		return Integer.parseInt(newNum);
	}
}
