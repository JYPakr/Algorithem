package BaekJoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Num_2444 {
	
	public static void main(String[] args) throws IOException{
		
		//case 1
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			for(int j = 0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j<i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <=n; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<n-i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j<n-i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
