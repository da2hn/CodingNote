package baekjoonP;

import java.util.HashSet;
import java.util.Scanner;

public class B3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> moreNum = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			moreNum.add(sc.nextInt() % 42);
		}
		
		System.out.println(moreNum.size());
		
	}
}
