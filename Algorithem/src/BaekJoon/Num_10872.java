package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Num_10872 {

//	//case 1
//	public static void main(String[] agrs) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//   
//
//        //N
//        int N = Integer.parseInt(br.readLine());
//     
//        int sum = factorial(N);
//  	  System.out.println(sum);
//        br.close();
//	}
//	
//	public static int factorial(int N) {
//		if(N <= 1) return 1; //재귀 종료조건
//		return N * factorial(N - 1);
//	}
	
	//case 2
	public static void main(String[] agrs) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   

        //N
        int N = Integer.parseInt(br.readLine());
        br.close();
        int sum = 1;
        
        // N 이 0이 아닐 때 까지 1씩 감소하면서 sum에 반복적으로 곱해준다
        while (N != 0) {
        	sum = sum*N;
        	N--;
        }
        
  		System.out.println(sum);
   
	}

}
