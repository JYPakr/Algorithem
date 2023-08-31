package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_11718 {
	
	public static void main(String[] args) throws IOException{
		
//		//case 1
//		Scanner sc = new Scanner(System.in);
//		
//		while (sc.hasNext()) {
//			System.out.println(sc.nextLine());
//		}
		
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		//case 2
//		String s;
//		while((s = br.readLine()) != null) {
//			System.out.println(s);
//		}
		
		//case 3
		while(true) {
			String str = br.readLine();
			if(str == null || str.isEmpty()) {
				break;
			}
			sb.append(str).append("\n");
		}
		
		br.close();
		System.out.println(sb);
	}
}
