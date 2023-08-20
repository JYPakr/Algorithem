package BaekJoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Num_10813 {
	
	public static void main(String[] args) throws IOException{

		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int arr[] = new int[N];
		int temp;
		
		
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1; 
		}
		
		for (int k = 0; k < M; k++) {
			st = new StringTokenizer(br.readLine(), " ");
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			
			temp = arr[I-1];
			arr[I-1] = arr[J-1];
			arr[J-1] = temp;
			
		}
		for (int j = 0; j < arr.length; j++) {
			bw.write(arr[j] + " ");
		}
		
        br.close();
        bw.flush();
        bw.close();

	
		

	}
}
