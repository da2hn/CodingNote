package baekjoonP;


import java.util.Scanner;

public class B1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int realNum = num; //사이클 돌리기 전 원래 값
		int count = 0; //사이클 돌아간 횟수
		
		while(true) {
			num = ((num % 10) * 10) + ((num / 10 + num % 10) % 10);
			count++;
				
			if(realNum == num) {
				break;
			}
			
		}
		System.out.println(count);
	}
}
