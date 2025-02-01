/**
 * La classe Multicoque représente un type de voilier caractérisé par plusieurs coques.
 * Elle hérite de la classe Voilier et ajoute une distinction sur le type de bateau.
 */
public class Multicoque extends Voilier{

    /**
     * Constructeur de la classe Multicoque
     * @param nom le nom du voilier
     * @param skipper le nom du skipper qui pilote le voilier
     */
    public Multicoque(String nom , String skipper) {
        super(nom , skipper);
    }

    /**
     * 2ème constructeur de la classe Multicoque
     * @param nom le nom du voilier
     * @param suivreRoute La stratégie de suivi de route du voilier
     */
    public Multicoque(String nom, SuivreRoute suivreRoute) {
        super(nom, suivreRoute);
    }


    /**
     * La methode toString renvoie un texte
     * @return le nom du voilier ainsi que son type
     */
    public String toString() {
        return " le nom est : " + nom + " le type du bateau est : Multicoque " ;
    }



}
