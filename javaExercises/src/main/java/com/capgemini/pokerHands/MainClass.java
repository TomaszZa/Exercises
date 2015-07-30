package com.capgemini.pokerHands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {
	public static void main(String args[]){
		Player player1,player2;
		boolean playerOneWin = false;
		int playerOneWins = 0;
		
		try{
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\tozabloc\\"
					+ "Desktop\\Projekty\\javaExercises\\src\\main\\java\\com\\capgemini\\pokerHands\\poker.txt"));
			
			for(int i = 1; i<1001; i++){
				
			player1 = new Player(file);
			player1.sequenceCalculating();
				
				player2 = new Player(file);
				player2.sequenceCalculating();
				
				while(player2.compareResult() == player1.compareResult()){
					player2.HighestRoll();
					player1.HighestRoll();
				}
				
				playerOneWin = (player2.compareResult() < player1.compareResult())?true:false;	
				if(playerOneWin) playerOneWins++;
		
			}
		
			System.out.println("Player1 wins: "+playerOneWins+" times.");
			
		}catch(IOException exc){
			System.out.println("File open failure!");
	    }	
	}
    
}

