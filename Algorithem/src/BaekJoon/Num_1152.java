package BaekJoon;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Num_1152 {
	
	public static void main(String[] agrs) throws IOException {
		
//		//case 1
//		Scanner sc = new Scanner(System.in);
//		
//		
//		String str = sc.nextLine();
//		sc.close();
//		
//		StringTokenizer st = new StringTokenizer(str," ");
//		
//		// countTokens() 는 토큰의 개수를 반환한다
//		System.out.println(st.countTokens());	
//		
//		
//		//case 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		System.out.println(st.countTokens());
//
//		br.close();
		
		//case 3
		
		int count = 0;
		int pre_str = 32; //아스키코드에서 공백은 32
		int str;
		
		while(true) {
			str = System.in.read();
			
			//입력받은 문자가 공백일 때,
			if(str == 32) {
				//이전의 문자가 공백이 아니면
				if(pre_str != 32) count++;
				
			}
			//입력받은 문자가 개행일때 ('\n)
			else if(str == 10) {
				//이전의 문자가 공백이 아니면
				if(pre_str != 32) count++;
				break;
			}
			
			pre_str = str;
		}
		
		System.out.println(count);
	}
}
