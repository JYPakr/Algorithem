package BaekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num_12789 {
	
	public static void main(String[] agrs) throws IOException{
		

		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int n = Integer.parseInt(br.readLine());
		
		int[] line = new int[n]; //승환이 앞에 서있는 학생들의 수만큼 순서 저장하는 배열
		
		//승환이 앞에 서있는 모든 학생들의 번호표 앞 -> 뒤로 주어짐
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			
			line[i] = Integer.parseInt(st.nextToken());
			
		}
		
	    br.close();
        bw.write(sol(line));
        bw.flush();
        bw.close();
		
	}
	
	public static String sol(int[] stack) {
		int orderVal = 1; //첫번째로 뽑아야할 값
		
		//해당 값이 다를 경우 임시로 저장할 stack
		Stack<Integer> tmpStack = new Stack<>();
		
		// stack.length : 승환이 앞에 있는 학생 수
        for(int i = 0; i < stack.length; i++){ 
        	
        	if(stack[i] != orderVal) { //찾는 번호가 아닐 경우 
        		//임시 저장공간이 비어있지 않으면서 가장 최근에 들어간 요소가 찾는 번호일 경우
        		if(!tmpStack.isEmpty() && tmpStack.peek() == orderVal) {
        			tmpStack.pop();
        			i--;//임시 저장소에 있었지 stack이라는 공간에 있었던 것은 아니므로 한번더 반복해야한다.
                    orderVal++;
        		}else {
        			tmpStack.push(stack[i]);
        		}
        		
        	}else { //찾는 번호일 경우
        
        		 orderVal++; //찾을 다음 번호로 넘어간다.
        		
        	}
        		
        }
        
        boolean result = true; //결과 유효성 검사
        
        //stack.length를 다 비우고, 임시 저장소는 비어있지 않을 수 있다.
        for(int i = 0; i < tmpStack.size(); i++) {
        	int tValue = tmpStack.pop(); //임시저장소에 최근에 들어간 번호
        	
        	if(tValue == orderVal) { //찾으려는 번호 이어서 저장
        		orderVal++;
        	}else {
        		//찾으려는 번호가 아니면 나오는 순서가 맞을 수 없으므로
                result = false;
                break; //더이상 반복X
        	}
        	
        }
        
        return result ? "Nice" : "Sad";
        
	}
	
	
}
