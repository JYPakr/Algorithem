package Programmers.Lv0;
import java.util.*;
public class Num_120956 {
	
	public static void main(String args[]) {
		String [] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		System.out.println(solution(babbling));
	}

    public static int solution(String[] babbling) {
    	int answer = 0;
    	
        for(int i = 0; i < babbling.length; i++) {
        	babbling[i] = babbling[i].replaceFirst("aya", "0");
        	babbling[i] = babbling[i].replaceFirst("woo", "0");
        	babbling[i] = babbling[i].replaceFirst("ye", "0");
        	babbling[i] = babbling[i].replaceFirst("ma", "0");
        	babbling[i] = babbling[i].replace("0", "");
        	
        	if(babbling[i].equals("")) answer++;
        	
        	
        }
       
        return answer;
    }

}
