package baekjoonP;

import java.util.Scanner;

public class B1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(xmake(num));
		
		
	}
	
	public static int xmake(int num) {
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			int a = 0; //첫번째 자리
			int b = 0; // 두번째 자리
			int c = 0; // 세번째 자리
			
			if(i < 100) { //1 ~ 99면 등차수열이므로 count++
				count ++;
			
			}else if(i == 1000){ //1000이면 등차수열이 아니므로 continue
				continue;
				
			}else { // 100 ~ 999
				a = i % 10;
				b = (i % 100) / 10;
				c = i / 100;
				
				if(b - a == c - b) { //등차수열이면 count++
					count ++;
				}
				
			}
			
			
		}
		
		
		return count;
	}
}
