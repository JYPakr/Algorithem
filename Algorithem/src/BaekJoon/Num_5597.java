package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;



public class Num_5597 {
	
	public static void main(String[] args) throws IOException{

		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		
		boolean arr[] = new boolean[31];
		
		for (int i = 0; i < 28; i++) {
		
			arr[Integer.parseInt(br.readLine())] = true;
			
		}
		
		for (int j = 1; j < arr.length; j++) {
			if (!arr[j]) {
				System.out.println(j);
			}
		}
		
        br.close();
  
	}
}
