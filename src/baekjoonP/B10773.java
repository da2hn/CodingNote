package baekjoonP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class B10773 {
	 public static void main(String[] args) throws IOException{
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int k = Integer.parseInt(br.readLine());
		 Stack<Integer> stack = new Stack<>();
		 
		 for (int i = 0; i < k; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				stack.pop();
			
			}else {
				stack.push(num);
			}
			
		}
		 
		 System.out.println(stack);
		 
		 int sum = 0;
		 
		 for (Integer s : stack) {
			sum += s;
		}
		 
		 System.out.println(sum);
		 
	 }
}
