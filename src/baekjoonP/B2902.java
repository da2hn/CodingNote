package baekjoonP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2902 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String longName = br.readLine();
		
		String shortName = "";
		
		shortName += longName.charAt(0);
		
		
		for (int i = 0; i < longName.length(); i++) {
			
			if(longName.charAt(i) == '-') {
				shortName += longName.charAt(i+1);
			}
		
		}
		
		System.out.println(shortName);
		
	}
}
