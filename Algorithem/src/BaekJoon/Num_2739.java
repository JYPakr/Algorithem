package BaekJoon;
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Num_2739 {
	
	public static void main(String[] args) throws IOException{
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//case 1
		for (int i = 1; i <= 9; i++) {
			
			System.out.println(n + " * "+ i +" = " + (n* i));
		
		}
	
	
	}

	
}
