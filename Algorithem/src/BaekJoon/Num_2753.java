package BaekJoon;
import java.util.Scanner;


public class Num_2753 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sYear = sc.nextInt();
		
		if (sYear % 4 == 0 && (sYear % 100 != 0 || sYear % 400 == 0)) {
			System.out.println("1");
		}else {System.out.println("0");}
		
		
			
		
	}
}
