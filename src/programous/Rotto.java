package programous;

import java.util.Scanner;

public class Rotto {
	public int[] solution(int[] lottos, int[] win_nums) {
	      int[] answer = new int[2];
	      int max = 0;
	      int min = 0;
	      
	      for (int i = 0; i < win_nums.length; i++) {
	    	  for (int j = 0; j < win_nums.length; j++) {
	    		  if(lottos[i] == win_nums[j]) {
	    			  max ++;
	    			  min ++;
	    		  }
	    	  }
	      }
	      
	      for (int i = 0; i < lottos.length; i++) {
	    	  if(lottos[i] == 0) {
	    		  max++;
	    	  }
	      }
	      
	      
	      answer[0] = max;
	      answer[1] = min;
	      
	      for (int i = 0; i < answer.length; i++) {
	    	  switch(answer[i]) {
	    	  	case 6: answer[i] = 1;
	    	  		break;
	    	  	case 5: answer[i] = 2;
	    	  		break;
	    	  	case 4: answer[i] = 3;
	    	  		break;
	    	  	case 3: answer[i] = 4;
	    	  		break;
	    	  	case 2: answer[i] = 5;
	    	  		break;
	    	  	default : answer[i] = 6;
	    	  		break;
	    	  }
	      }
	      
	      
	      return answer;
	  }
	
}
