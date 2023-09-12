package BaekJoon;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



public class Num_25206 {
	
	public static void main(String[] args) throws IOException{

		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double t = 0.0;
		double t2 = 0.0;
		double t_sum = 0.0;
		double sum = 0.0;
		double avr = 0.0;
		for(int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			t = Double.parseDouble((st.nextToken())); //학점
			
			String str2 = st.nextToken(); //과목평점
			
			if (str2.equals("A+") ) {
				t2 = 4.5;
			}else if (str2.equals("A0")) {
				t2 = 4.0;
			}else if (str2.equals("B+")) {
				t2 = 3.5;
			}else if (str2.equals("B0")) {
				t2 = 3.0;
			}else if (str2.equals("C+")) {
				t2 = 2.5;
			}else if (str2.equals("C0")) {
				t2 = 2.0;
			}else if (str2.equals("D+")) {
				t2 = 1.5;
			}else if (str2.equals("D0")) {
				t2 = 1.0;
			}else if (str2.equals("F")) {
				t2 = 0.0;
			}else if (str2.equals("P")) {
				continue;
			}
			t_sum += t;
			sum += t * t2;
		
		}
	
		avr = sum / t_sum;
		
		System.out.println(avr);
		
	}
}
