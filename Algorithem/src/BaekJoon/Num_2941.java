package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2941 {
	
	public static void main(String[] agrs) throws IOException{
		
		//case 1
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		
		String str = br.readLine();
		String[] cr = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int cnt = 0;
		
		for (int i = 0; i <= 7; i++) {
			
			if(str.contains(cr[i])){
				cnt ++;
				
			};
			
		}
		br.close();
		
		System.out.println(cnt);
		
	
	}
}
