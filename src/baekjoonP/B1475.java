package baekjoonP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1475 {
	public static void main(String[] args) throws IOException {
		
		int[] arNums = new int[10];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String roomNum = br.readLine();
		
		for (int i = 0; i < roomNum.length(); i++) {
			
			char nums = roomNum.charAt(i);
			
			if(nums - '0' == 6 || nums - '0' == 9) { //6이나 9면 
				arNums[6]++; //arNums[6]에 1씩 더한다
				continue;
			}

			arNums[nums - '0']++;
			
		}
		
		
		
		int max = arNums[0];
		
		
		for (int i = 0; i < arNums.length; i++) {
			
			if(i == 6) { //i가 6또는 9일때
				
				if(arNums[i] % 2 == 1) {// 홀수일때
					
					arNums[i] = (arNums[i] + 1) / 2;
					
				}else {// 짝수일때
					
					arNums[i] = (arNums[i]) / 2; 
					
				}
				
			}
			
			
			if(max < arNums[i]) { //제일 높은 값 구하기
				max = arNums[i];
			}
			
		}
		
		System.out.println(max);
	}
}
