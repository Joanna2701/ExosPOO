/**
 * 
 */
package fr.fms.poo;

import java.util.Scanner;

/**
 * 
 */
public class City {

	
	/**
	 * @param args
	 */
	
	private String nameCity;
	private String country;
	public int numberResident;
	
	protected Scanner scan = new Scanner(System.in);
	
	// Constructeurs
	
	public City(String nameCity, String country, int numberResident) {
		super();
		this.nameCity = nameCity;
		this.country = country;
		this.numberResident = numberResident;
	}
	
	
	// 1.3 Nouveau constructeur avec 2 paramètres + unknown pour le Pays
	public City(String nameCity, int numberResident) {
		this.nameCity = nameCity;
		this.country = "Unknown";
		this.numberResident = numberResident;
	}
	
	
	 // Getter pour l'attribut numberResident
    protected int getnumberResident() {
        return numberResident;
    }
	
    public String getNameCity() {
		return nameCity;
	}

    public String getCountry() {
		return country;
	}
   
	
	// Accesseurs
	

    // Méthode pour afficher la ville avec unknown
    //1.4
 	public void display() {
 		System.out.println("Ville de " + nameCity + " en " + country + " ayant " + numberResident + " habitants.");
 	}
    
    
    
	 // Setter pour l'attribut numberResident pour modifier le nb
    protected void setnumberResident(int numberResident) {
        //this.numberResident = numberResident + 20000;
    	//System.out.println("Vous ne pouvez pas modifier la valeur ici");
    	if (numberResident < 0 )
    		throw new RuntimeException ("Le nombre d'habitants ne peut pas être négatif!");
    	this.numberResident = numberResident;
    }
	
	
	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	

	public void setCountry(String country) {
		this.country = country;
	}
	
	//1.6  elle remplace la version par défaut de la méthode héritée de la classe Objet
	@Override
	public String toString() {
	    return "Ville de " + nameCity + " en " + country + " ayant " + numberResident + " habitants.";
	}
	
	

	// Méthodes
	
	
//	public void display() {
//		System.out.println("La ville de : " + nameCity + "\n" +
//							"en : " + country + "\n" +
//							"avec pour nombre d'habitants : " + numberResident + "\n") ;
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}