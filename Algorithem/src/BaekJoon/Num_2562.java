package BaekJoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Num_2562 {
	
	public static void main(String[] args) throws IOException{
		
//		//case 1
//		Scanner sc = new Scanner(System.in);
//		int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(),
//				sc.nextInt(), sc.nextInt(), sc.nextInt(),
//				sc.nextInt(), sc.nextInt(), sc.nextInt()};
//		
//	
//		int count = 0;
//		int max = 0;
//		int index = 0;
//		
//		for(int value : arr) {
//			count++;
//			
//			if(value > max) {
//				max = value;
//				index = count;
//			}
//			
//		}
//		System.out.print(max + "\n" + index);
		
//		//case 2
//		int max = 0;
//		int index = 0;
//		int count = 0;
//		while (sc.hasNextInt()) {
//			count ++;
//			int N = sc.nextInt();
//			if (N > max) {
//				max = N;
//				index = count;
//			}
//			
//		}
//		
//		sc.close();
//	
//		System.out.print(max + "\n" + index);
		
		
//		//case 3
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int[] arr = new int[9];
//		
//		for(int i = 0 ; i < 9 ; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		
//		int max = 0;
//		int index = 0;
//		
//		int count = 0;
//		
//		for(int value : arr) {
//			count++;
//			if(value > max) {
//				max = value;
//				index = count;
//			}
//		}
// 
//		System.out.println(max);
//		System.out.println(index);

		//case 4
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int index = 0;
		
		for(int i = 0 ; i < 9 ; i++) {
			 
			int val = Integer.parseInt(br.readLine());
			
			if(val > max) {
				max = val;
				index = i+1;
			}
		}
 
		System.out.println(max);
		System.out.println(index);
		
	}
}
