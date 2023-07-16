package BaekJoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Num_9498 {
	
	public static void main(String[] args) throws IOException{
		
		//case 1
//		Scanner sc = new Scanner(System.in);
//		
//		int S = sc.nextInt();	
//		
//		if(S >= 90 ) {
//			System.out.println("A");
//		
//		}else if (S >= 80) {
//			System.out.println("B");
//		}else if (S >= 70) {
//			System.out.println("C");
//		}else if (S >= 60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		
		System.out.println((A>=90)?"A" :(A>=80)? "B":(A>=70)? "C" :(A>=60)? "D": "F");
		
		
	}
}
