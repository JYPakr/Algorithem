package BaekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Num_2563 {
	
	public static void main(String[] args) throws IOException{

		
		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		//도화지 영역 배열
		boolean[][] check = new boolean[101][101];
		
		//색종이 붙이기 진행
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
		
			//(x,y)부터 (x+9, y+9)까지의 영역을 하나씩 체크한 후 총 넓이에 더해준다
			for(int j = y; j < y+10; j++) {
				for(int k = x; k < x+10; k++) {
					 if (!check[j][k]) {
						 check[j][k] = true;
	                        ans++;
	                    }
				}
			}
			
		}
	
		bw.write(ans + "");	//영역의 넓이 BufferedWriter 저장
        bw.flush();		
        bw.close();
        br.close();
		
	}
}
