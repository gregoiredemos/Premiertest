package fr.demos;

public class Livre extends Article {

	private String auteur;
	private String editeur;
	private String titre;
	private String genre;
	
	
	public Livre(String descrip, String ref, int stk, double pHT,String aut,String edit,String titr,String genr ) {
		super(descrip, ref, stk, pHT);
		
		this.auteur=aut;
		this.editeur=edit;
		this.titre=titr;
		this.genre=genr;
	
	}


	public String getAuteur() {
		return auteur;
	}


	public String getEditeur() {
		return editeur;
	}


	public String getTitre() {
		return titre;
	}


	public String getGenre() {
		return genre;
	}


	@Override
	public String toString() {
		return super.toString() + "Livre [auteur=" + auteur + ", editeur=" + editeur + ", titre=" + titre + ", genre=" + genre + "]";
	}

	
	
}
