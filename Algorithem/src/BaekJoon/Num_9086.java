package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Num_9086 {
	
	public static void main(String[] args) throws IOException{
		
		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			System.out.println(str.charAt(0) +""+str.charAt(str.length() - 1));
		
		}
		
        br.close();
        
		
  
		
  
	}
}
