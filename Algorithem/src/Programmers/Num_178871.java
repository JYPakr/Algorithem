package Programmers;
import java.util.*;
public class Num_178871 {
	
	
	public static void main(String args[]) {
		
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		solution(players, callings);
	
		
	}

    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        String temp;
        for(int i = 0; i < callings.length; i++) {
            
             for(int j = 0; j < players.length; j++) { 
                  if(players[j] == callings[i]) {
                      
                      temp = players[j];
                      players[j] = callings[i];
                      players[j - 1] = temp;
               
                  }
             }
           
        }
        
        answer = players;

        
        return answer;
    }

}
