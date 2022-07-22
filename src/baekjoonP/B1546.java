package baekjoonP;

import java.util.Scanner;

public class B1546 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		double[] arScore = new double[count];
		double sum = 0; //새로운 점수들의 합
		
		double maxScore = arScore[0]; 
		
		for (int i = 0; i < arScore.length; i++) {
			arScore[i] = sc.nextInt(); //count만큼 점수를 입력받기
			
			if(maxScore < arScore[i]) { 
				maxScore = arScore[i]; //제일 높은 점수 구하기
			}
		}
		
		for (int j = 0; j < arScore.length; j++) { //모든 점수를 제일 높은 점수의 기준으로 바꾸기 
			arScore[j] = arScore[j] / maxScore * 100.0;
			sum += arScore[j]; //바꾼 점수들의 총점 구하기
		}
		
		System.out.println(sum / count); //평균구하기
		
		
		
		
		
		
	}
}
