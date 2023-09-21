package BaekJoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Num_2720 {
	
	public static void main(String[] args) throws IOException{

		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
		
			int M = Integer.parseInt(br.readLine());
			
			int qrt = Math.floorDiv(M, 25); // 4
		
			M = Math.floorMod(M, 25);
			
			int dim = Math.floorDiv(Math.floorMod(M, 25), 10); //24
			
			M = Math.floorMod(M, 10);
			
			int nic = Math.floorDiv(Math.floorMod(M, 10), 5);
			
			M = Math.floorMod(M, 5);
			
			int pen = M;
		
			System.out.println(qrt + " " + dim + " " + nic + " " + pen);
		
		}
		
        br.close();
    
		

	}
}
