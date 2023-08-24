package BaekJoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Num_27866 {
	
	public static void main(String[] args) throws IOException{

//		//case 1
//		Scanner sc = new Scanner(System.in);
//		
//		String str = sc.next();
//		int n = sc.nextInt() - 1;
//		
//		System.out.println(str.charAt(n));
//		sc.close();
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String N = br.readLine();
		int M = Integer.parseInt(br.readLine())-1;

		
		bw.write(N.charAt(M));
		
        br.close();
        bw.flush();
        bw.close();

	
		

	}
}
