package BaekJoon;
//import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Num_2884 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}else {
			System.out.println(H + " " +(M-45));
		}
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int HH = sc.nextInt();
		int MM = sc.nextInt();
		
		if (MM < 45) {
			HH --;
			
			MM = 60 - (45-MM);
			if (HH < 0) {
				HH = 23;
			}
			
			System.out.println(HH + " " + MM);
		}else {
			System.out.println(HH + " " + (MM - 45));
		}
		*/
		
			
		
	}
}
