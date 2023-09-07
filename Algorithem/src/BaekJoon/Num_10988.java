package BaekJoon;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Num_10988 {
	
	public static void main(String[] agrs) throws IOException {
		
		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		String str = br.readLine();
		int ans = 1;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			
			if (c != str.charAt(str.length() - i - 1)) {
				ans = 0;
                break;
			}
		}
		
	    bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
	
//		//case 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder(br.readLine());
//        
//        bw.write(((sb.toString().equals(sb.reverse().toString())) ? 1 : 0) + "\n");
//        bw.flush();
//        bw.close();
//        br.close();

	}
}
