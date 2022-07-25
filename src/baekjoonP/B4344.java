package baekjoonP;

import java.util.Scanner;

public class B4344 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCount = sc.nextInt();
		
		for (int i = 0; i < testCount; i++) {
			int count = sc.nextInt();	//반복마다 입력할 점수의 갯수
			int[] arScore = new int[count];  //입력받은 갯수 크기의 점수 배열생성
			int sum = 0;
			double avg = 0;
			int upCount = 0;
			double ratio = 0;
			
			for (int j = 0; j < arScore.length; j++) {
				arScore[j] = sc.nextInt(); //각 케이스별 점수 입력
				sum += arScore[j];

			}
			
			avg = sum / (arScore.length + 0.0); 
			
			
			for (int j = 0; j < arScore.length; j++) {
				if(avg < arScore[j]) {
					upCount++; //과목점수가 평균점수보다 높을때 ++
				}
			}
			
			ratio = upCount * 100.0 / arScore.length; //비율구하기
			
			
			System.out.printf("%.3f%%\n", ratio);
			
		}
		
		
	}
}
