package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;



public class Num_28278 {
	
	
	static LinkedList<Integer> stack = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		
//		//case 1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       
//        StringTokenizer st;
//        
//        int N = Integer.parseInt(br.readLine()); //명령어의 수
//		
//        while (N-- >0) {
//        	 st = new StringTokenizer(br.readLine());
//             String command = st.nextToken();
//             if(command.equals("1")){
//                 stack.addFirst(Integer.parseInt(st.nextToken()));
//             }else if(command.equals("2")){
//                 sb.append(stack.isEmpty() ? -1 : stack.pollFirst()).append("\n");
//             }else if(command.equals("3")){
//                 sb.append(stack.size()).append("\n");
//             }else if(command.equals("4")){
//                 sb.append(stack.isEmpty() ? 1 : 0).append("\n");
//             }else if(command.equals("5")){
//                 sb.append(stack.isEmpty()? -1 : stack.getFirst()).append("\n");
//             }
//        	
//        }
//        br.close();
//        System.out.println(sb);
        
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine()); //명령어의 수
		
        while (N-- >0) {
        	sol(br.readLine());
        	
        }
        br.close();
        
        System.out.println(sb);
	
	}
	
	static void sol(String query) {
		
		char c = query.charAt(0);
		
		 switch (c){
         //case 1의 경우 query.substring(2);를 한 이유는 공백도 문자로 포함하기 때문이다 1 X 형태이기 때문에 X의인덱스는 2다.
         case '1' : stack.push(Integer.parseInt(query.substring(2))); return;
         case '2' : sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); return;
         case '3' : sb.append(stack.size()).append("\n"); return;
         case '4' : sb.append(stack.isEmpty() ? 1 : 0).append("\n"); return;
         case '5' : sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n"); return;
         default: break;
     }
		
	}
}
