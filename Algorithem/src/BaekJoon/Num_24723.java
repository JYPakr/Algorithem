package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Num_24723 {
	
	public static void main(String[] agrs) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   

        //N
        int N = Integer.parseInt(br.readLine());
    
        int sum = 1;
        for(int i = 0; i < N; i++) {
            sum *= 2;
        }       
  		System.out.println(sum);
  		
  		br.close();
	}
}
