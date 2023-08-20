package BaekJoon;

import java.util.Scanner;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;



public class Num_3052 {
	
	public static void main(String[] args) throws IOException{
		
//		//case 1
//		Scanner sc = new Scanner(System.in);
//		HashSet<Integer> h = new HashSet<Integer>();
//		
//		for (int i = 0; i < 10; i++) {
//			h.add(sc.nextInt() % 42);
//			
//		}
//		
//		sc.close();
//		System.out.print(h.size());
//		
//		//case 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		HashSet<Integer> h = new HashSet<Integer>();
//		
//		
//		for (int i = 0; i < 10; i++) {
//			h.add(Integer.parseInt(br.readLine()) % 42);
//		}
//		
//		System.out.print(h.size());
//		br.close();
		
		//case 3
		boolean[] arr = new boolean[42];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		
		int cnt = 0;
		for(boolean value : arr) {
			if(value) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}
