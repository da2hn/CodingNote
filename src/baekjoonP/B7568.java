package baekjoonP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B7568 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][2]; 
		
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt(); //몸무게
			arr[i][1] = sc.nextInt(); //키
			
		}
		
		for (int i = 0; i < n; i++) {
			int rank = 1;
			for (int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				}
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
				
				
			}
			
			System.out.print(rank +" ");
		}
		
		
		
	}
}
