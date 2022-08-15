package baekjoonP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1748 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int temp = 0;
		int count = 1;
		int length = 10;
		
		// 10보다 작으면 1씩 증가
		// 100보다 작으면 2씩 증가
		// 1000보다 작으면 3씩 증가
		
		
		for (int i = 1; i <= num; i++) {
			
			if(i == length) {
				count++;
				length = length * 10;
			}
			
			temp += count;
			
		}
		
		
		System.out.println(temp);
		
	}
}
