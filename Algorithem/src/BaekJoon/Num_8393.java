package BaekJoon;
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Num_8393 {
	
	public static void main(String[] args) throws IOException{
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		br.close();
		//case 1
		for (int i = 1; i <= n; i++) {
			
			sum += i;
			
		}
		System.out.println(sum);
	}

}
