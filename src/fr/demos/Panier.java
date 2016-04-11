package fr.demos;

import java.util.ArrayList;

public class Panier {
	
	
	private ArrayList<Article> livres=new ArrayList<>() ;
	
	
	/*public void Panier(ArrayList<Article> livr){
		this.livre=livr;}*/
	
	
	public void ajouter(Article livr){
		this.livres.add (livr);
		
		livr.setStock(livr.getStock()-1);
		
	
		
	}


	public void retirer(Article livr){
		this.livres.remove (livr);
		livr.setStock(livr.getStock()+1);
		
	}
	
	
	@Override
	public String toString() {
		return "Panier [livres=" + livres + "]";
	}


	public ArrayList<Article> getLivres() {
		return livres;
	}
	

}
