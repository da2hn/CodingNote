package baekjoonP;

import java.util.Scanner;

public class B10818 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] num = new int[count];
		int max;
		int min;
		
		for (int i = 0; i < num.length; i++) { //입력받은 개수 만큼 반복
			num[i] = sc.nextInt();
		}
		
		max = num[0];
		min = num[0];
		
		for (int i = 0; i < num.length; i++) { //최댓값 구하기
			if(num[i] > max) {
				max = num[i];
			}
		}
		
		for (int i = 0; i < num.length; i++) { //최소값 구하기
			if(num[i] < min) {
				min = num[i];
			}
		}
		
		System.out.println(min + " " + max);
		
		
	}
}
