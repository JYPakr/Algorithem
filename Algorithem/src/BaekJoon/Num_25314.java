package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Num_25314 {

	public static void main(String[] agrs) throws IOException {
		
		//case1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
	
		br.close();
		
		int a = n / 4;
		String str = "";
		
		for (int i = 0; i < a; i++) {
			
			str += "long ";
	
		}
		
		System.out.println(str + "int");

	}
}
