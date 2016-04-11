package fr.demos;

public class Article {

	private String description;
	private String reference;
	private int stock;
	private double prixHT;
	
	public Article(String descrip, String ref , int stk ,double pHT){
	
		this.description = descrip;
		this.reference = ref;
		this.stock = stk;
		this.prixHT = pHT;
	}

	public String getDescription() {
		return description;
	}

	public String getReference() {
		return reference;
	}

	public int getStock() {
		return stock;
	}

	public double getPrixHT() {
		return prixHT;
	}

	@Override
	public String toString() {
		return "Article [description=" + description + ", reference=" + reference + ", stock=" + stock + ", prixHT="
				+ prixHT + "]";
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
	
}
