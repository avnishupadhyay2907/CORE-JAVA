package com.rays;

public class NoteCount {

	public static void main(String[] args) {
		
		int [] notes = { 500,200,100,50,20,10,5,2,1};
		
		int rupees = 5565;
		
		int count = 0;
		
		for (int i = 0; i < notes.length; i++) {
			
			 count = rupees /notes [i];
			 rupees = rupees % notes [i];
			 
			 if (count > 0) {
				
				 System.out.println(notes[i] + "count =" + count);
				 
			}
			
			 
			 
		}
		
	}
	
}
