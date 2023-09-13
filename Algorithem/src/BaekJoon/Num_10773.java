package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;



public class Num_10773 {
	
	
	
	
	public static void main(String[] args) throws IOException{
		
//		//case 1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		LinkedList<Integer> stack = new LinkedList<>();
//        
//        int N = Integer.parseInt(br.readLine()); 
//	
//        for(int i = 0; i < N; i++) {
//        	
//        	int k = Integer.parseInt(br.readLine());
//        	
//        	if (k == 0) {
//        		stack.pop();
//        	}
//        	else {
//        		stack.push(k);
//        	}
//        	
//        }
//        
//        int sum = 0;
//        for (int o : stack) {
//        	sum += o;
//        }
//        
//        br.close();
//        System.out.println(sum);
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> stack = new LinkedList<>();
        
		int top = -1; //마지막 원소의 위치를 가리키는 변수
		
		int k = Integer.parseInt(br.readLine());
		int[] arr = new int[k];
		
		for(int i = 0; i < k; i++) {
			
			int num = Integer.parseInt(br.readLine()); //정수 입력
			
			if(num == 0) { //0이라면 top 위치에 있는 원소를 0으로 초기화
				top--; //top이 가리키는 위치 1 감소
			}else {
				top++;	// top이 가리키는 위치 1 증가
				arr[top] = num;	// 입력받은 정수로 초기화
			}
			
		}
		
		int sum = 0;
		for (int i = 0; i <= top; i++) { // 합을 구할 때 K가 아닌 top까지이다.
			sum += arr[i];
		}
		System.out.println(sum);
		
	}
}
