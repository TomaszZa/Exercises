package com.capgemini.nodes;

/**
 * Created by ldrygala on 2015-02-09.
 */
public class Node {
    private String id;
    private String description;
    private String predecessorId;
    
    
    Node(String i,String d, String p){
    	id = i;
    	description = d;
    	predecessorId = p;
    }
  //metody dostepowe	
    public void putID(String a){
    	id = a;
    }
    
    public String getID(){
    	return id;
    }
    
    public void putDescription(String b){
    	description = b;
    }
    
    public String getDescription(){
    	return description;
    }
    
    public void putPredecessorId(String c){
    	predecessorId = c;
    }
    
    public String getPredecessorId(){
    	return predecessorId;
    }
}
