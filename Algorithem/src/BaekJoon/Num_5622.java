package BaekJoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Num_5622 {
	
	public static void main(String[] args) throws IOException{
		
		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int cnt = 0;
	
		for(int i = 0; i < str.length(); i++) {
		
			switch (str.charAt(i)) {
			
			case 'A' : case 'B' : case 'C' :
				cnt += 3;
				break;
				
			case 'D' : case 'E': case 'F' :
				cnt += 4; 
				break;
                
			case 'G' : case 'H': case 'I' :
				cnt += 5; 
				break;
                
			case 'J' : case 'K': case 'L' : 
				cnt += 6;
				break;
                
			case 'M' : case 'N': case 'O' :
				cnt += 7;
				break;
                
			case 'P' : case 'Q': case 'R' : case 'S' : 
				cnt += 8; 
				break;
                
			case 'T' : case 'U': case 'V' : 
				cnt += 9;
				break;
                
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				cnt += 10;
				break;
			}
		}
		
		System.out.print(cnt);

//		//case 2
//		int cnt = 0;
//		int val;
//		
//		while(true) {
//			
//			val = System.in.read();
//			
//			if(val == '\n') {
//				break;
//			}
//			
//			if(val < 68) cnt += 3;
//			else if(val < 71) cnt += 4;
//			else if(val < 74) cnt += 5;
//			else if(val < 77) cnt += 6;
//			else if(val < 80) cnt += 7;
//			else if(val < 84) cnt += 8;
//			else if(val < 87) cnt += 9;
//			else cnt += 10;
//			
//			
//		}
//		System.out.print(cnt);
//		
	}
}
