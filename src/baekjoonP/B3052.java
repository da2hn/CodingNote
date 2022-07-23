package baekjoonP;

import java.util.HashSet;
import java.util.Scanner;

public class B3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> moreNum = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			moreNum.add(sc.nextInt() % 42); //입력받은 숫자를 42로 나눴을 때 나머지 값을 add한다.
		}
		
		System.out.println(moreNum.size());
		
	}
}
