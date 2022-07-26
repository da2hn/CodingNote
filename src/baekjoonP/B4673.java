package baekjoonP;

import java.util.ArrayList;

public class B4673 {
	public static void main(String[] args) {
		
		ArrayList<Integer> arNum = new ArrayList<>(); //생성자가 있는 수를 담을 List
		
		
		for (int i = 1; i <= 10000; i++) { 
			
			//단위별 각 자릿수합 add
			
			if(i < 10) { //10미만일 때
				arNum.add(i + i % 10);
				
			}else if(i < 100) { //100미만일 때
				arNum.add(i + i % 10 + i / 10);
			
			}else if(i < 1000) { //1000미만일 때
				arNum.add(i + i / 100 + (i % 100) / 10 + i % 10);
				
			}else if(i < 10000) { //10000미만일 때
				arNum.add(i + i / 1000 + (i % 1000) / 100 + (i % 100) / 10 + i % 10);
			
			}else if(i == 10000){ //10000일 때
				arNum.add(10001);
				
			}
			
		}
		
		for (int i = 1; i < 10000; i++) {
			if(!arNum.contains(i)) { //리스트에 포함되어있지 않는 정수 출력
				System.out.println(i);
				
			}
		}
	}
}
