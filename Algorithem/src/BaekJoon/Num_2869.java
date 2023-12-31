package BaekJoon;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Num_2869 {
	
	public static void main(String[] agrs) throws IOException {
		
		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(" ", br.readLine());
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		
		int day = (length - down) / (up - down);
		
		//나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if((length - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
	}
}
