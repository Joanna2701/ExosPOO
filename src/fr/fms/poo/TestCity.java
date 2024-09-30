/**
 * 
 */
package fr.fms.poo;

/**
 * 
 */
public class TestCity {

	/**
	 * @param args
	 * @param setnumberResident 
	 */
	public static void main(String[] args) {
		//1.5 erreur
		 //System.out.println(Toulouse);
		 City Toulouse = new City("Toulouse","France",450000);
		 City Montréjeau = new City("Montréjeau","France",2863);
		 City Tarbes = new City("Tarbes","France",40593);
		 City Nice = new City("Nice","France",342522);
		 
		// 1.3 Création d'une ville avec le constructeur à 2 paramètres
		City Rabat = new City("Rabat", 577000);

		 //Toulouse.getnameCity();
		 Toulouse.display();
		 Montréjeau.display();
		 Tarbes.display();
		 Nice.display();
		 Rabat.display();
		 
//		 Toulouse.setnumberResident(Toulouse.getnumberResident() + 20000);
//		// System.out.println("Après modification Toulouse a pour nombre d'habitants" + setnumberResident);
//		 Toulouse.display();
		 
		 
		 //System.out.println("Vous ne pouvez pas modifier la valeur ici");
		 
		 
		 //Toulouse.setnumberResident(37000);
		 
		 
		 
	}

	private static Object setnumberResident(int i) {
		// TODO Auto-generated method stub
		return null;
		}
}

	//1.2 Créer une méthode statique de l'objet, pour pouvoir modifier la valeur
	//private static Object setnumberResident(int i) {
		// TODO Auto-generated method stub
		//return null;











