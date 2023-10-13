package BaekJoon;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Num_19532 {
	
	public static void main(String[] agrs) throws IOException {
		
//		//case 1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		br.close();
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		int c = Integer.parseInt(st.nextToken());
//		int d = Integer.parseInt(st.nextToken());
//		int e = Integer.parseInt(st.nextToken());
//		int f = Integer.parseInt(st.nextToken());
//		
//		
//		for(int i = -999; i <= 999; i++) {
//			for(int j = -999; j <= 999; j++) {
//				if(a*i + b*j == c) {//ax + by가 c이고(x=i, y=j)
//					if(d*i + e*j == f) {//dx + ey가 f일 때(x = i, y = j)
//						bw.write(i + " " + j + "\n");
//						break;
//					}
//					
//					
//				}
//			}
//		}
//		bw.flush();
//		bw.close();
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		br.close();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		bw.write((c*e - b*f) / (a*e - b*d) + " "); //x축
		bw.write((c*d - a*f) / (b*d - a*e) + " ");	//y축	
		bw.flush();
		bw.close();
		
	}
}
