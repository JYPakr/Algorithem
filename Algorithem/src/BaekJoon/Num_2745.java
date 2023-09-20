package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_2745 {

	public static void main(String[] agrs) throws IOException {
		
//		//case 1
//		Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//		System.out.println(Integer.toString(a, b).toUpperCase());
		
		
		//case 2
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        
        //대문자 65~90
        while(N != 0) {
        	
        	if(N%B >= 10) sb.append((char) ((N % B) + 55));
        	else sb.append(N % B);
        	N /= B;
        	
        }
        
        System.out.println(sb.reverse().toString());
}
}
