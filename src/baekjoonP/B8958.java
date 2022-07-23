package baekjoonP;

import java.util.ArrayList;
import java.util.Scanner;

public class B8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] arQuiz = new String[count];
		
		for (int i = 0; i < count; i++) {
			arQuiz[i] = sc.next();
		}
		
		for (int i = 0; i < arQuiz.length; i++) { //퀴즈 갯수만큼 반복
			
			int cnt = 0; //연속횟수
			int sum = 0; //누적합산
			
				for (int j = 0; j < arQuiz[i].length(); j++) {
					
					if(arQuiz[i].charAt(j) == 'O') {
						
						cnt++;
						
					}else {
						
						cnt = 0;
						
					}
					
					sum += cnt;
					
				}
				
				System.out.println(sum);
		}
		
	}
}
