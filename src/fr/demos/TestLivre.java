package fr.demos;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class TestLivre {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw=null;
		
	try {
		pw=new PrintWriter("tester.txt");
	    pw.println("tester");
	
	}
	
	catch(IOException ex){
		System.out.print(ex.getMessage());
	}
	
finally {
     try {
    	 pw.close();
	    
	}
	
	catch (NullPointerException ex) {
		System.out.print(ex.getMessage());
	}
	
		
	}
	
	
	
		
		

		
		
		// livre String descrip, String ref, int stk, double pHT,String
		// aut,String edit
		Livre liv1 = new Livre("Livre scientifique", "S001", 200, 109, "Gregoire", "Technique", "Tecto", "Science");
		Livre liv2 = new Livre("Livre scientifique", "S002", 200, 109, "Gregoire", "Technique", "Tecto", "Science");
		Livre liv3 = new Livre("Livre scientifique", "S003", 200, 109, "Gregoire", "Technique", "Tecto", "Science");

		
		// mon panier
		Panier panier1 = new Panier();
		
		//Ajouter dans mon panier
		panier1.ajouter(liv1);
		panier1.ajouter(liv2);
		panier1.ajouter(liv3);
		

		// Article String descrip, String ref , int stk ,double pHT
		Article article1 = new Article("radio", "r001", 300, 280);
		Article article2 = new Article("radio", "r001", 300, 280);
		Article article3 = new Article("radio", "r001", 300, 280);

		panier1.ajouter(article1);
		panier1.ajouter(article2);
		panier1.ajouter(article3);
		
		//
		panier1.retirer(liv1);

		//System.out.print(panier1);

	}

}
