package BaekJoon;
import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Num_1546 {
	
	public static void main(String[] args) throws IOException{

//		//case 1 
//		Scanner in = new Scanner(System.in);
//		 
//		double arr[] = new double[in.nextInt()];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = in.nextDouble();
//		}
//		in.close();
//		
//		double sum = 0;
//		Arrays.sort(arr);
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum += ((arr[i] / arr[arr.length-1]) * 100);
//		}
//		System.out.print(sum / arr.length);
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		int N = Integer.parseInt(br.readLine());
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = -1; //입력받을 값이 0보다 크거나 같기 때문
		double sum = 0.0;
		
		
		for (int i = 0; i < N; i++) {
			
			int value = Integer.parseInt(st.nextToken());

			if(value > max) {
				max = value;
			}
			
			sum += value;
		}
		
        br.close();
        
        System.out.println(((sum / max) * 100.0) / N);
	
		

	}
}
