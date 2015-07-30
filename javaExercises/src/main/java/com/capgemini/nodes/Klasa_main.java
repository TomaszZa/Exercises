package com.capgemini.nodes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class Klasa_main {
	public static void main(String args[]){
		NodeValidators validation = new NodeValidators();
			
			validation.validateMethod(customerInterface());
	}
	
	public static List<Node> customerInterface(){
		Scanner konsol_in = new Scanner(System.in);
		PrintWriter konsol_out = new PrintWriter(System.out, true);
		String Id,descr,predId;
		List<Node> nodePartsList = new ArrayList<Node>();
		int numberOfNodes = 0;
		
		konsol_out.println("Add number of Nodes: ");
		numberOfNodes = konsol_in.nextInt();
		konsol_in.nextLine();
		
		 for(int i = 0; i< numberOfNodes;i++){
				
				konsol_out.println("Add node ID "+i+" :");
				Id = konsol_in.nextLine();
				konsol_out.println("Add description of node "+i+" :");
				descr = konsol_in.nextLine();
				konsol_out.println("Add predecessorID of node "+i+" :");
				predId = konsol_in.nextLine();	
				
				nodePartsList.add(new Node(Id,descr,predId));
				
			}
		 konsol_in.close();
		 return nodePartsList;
	}

	
	
}
