package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num_4949 {
	
	public static void main(String[] agrs) throws IOException{
		

		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
		
		while(true) {
			
			s = br.readLine();
			
			if(s.equals(".")) {
				break;
			}
			
			sb.append(sol(s)).append('\n');
		}
 
		System.out.println(sb);
		
	}
	
	public static String sol(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			//여는 괄호일 경우 스택을 넣는다.
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			// 아래는 모두 닫는 괄호 일 경우들이다.
			// 그 외의 경우 stack 원소를 pop 한다.
			else if(c == ')' ) {
				
				
				// 스택이 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우 
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}	
			else if(c == ']') {
				
				// 스택이 비어있거나 pop할 원소가 대괄호랑 매칭이 안되는 경우 
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
		}
		
		/*
		 * 모든 검사 마치고 스택에 잔여 요소가 있으면 여는 괄호가 많은 경우는 "NO" 
		 * 스택이 비어있으면 온전한 수식이므로 "YES" 이다.
		 */
 
		if (stack.empty()) {
			return "yes";
		} 
		else {
			return "no";
		}
		
		
	}
}
