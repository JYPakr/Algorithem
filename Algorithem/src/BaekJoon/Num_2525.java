package BaekJoon;
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Num_2525 {
	
	public static void main(String[] args) throws IOException{
		
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int M2 = Integer.parseInt(br.readLine());
		
		int min = (H * 60 + M) + M2;
		
		int hour = (min / 60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);
	}
}
