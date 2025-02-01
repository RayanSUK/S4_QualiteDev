/**
 * La classe Monocoque représente un voilier équipé d'une seule coque.
 * Elle hérite de la classe Voilier et permet de différencier ce type de bateau des multicoques.
 */
public class Monocoque extends Voilier {

    /**
     * Constructeur de la classe Monocoque
     * @param nom le nom du voilier
     * @param suivreroute la route à suivre
     * @param skipper le skipper qui pilote le voilier
     */
    public Monocoque(String nom , SuivreRoute suivreroute , String skipper) {

        super(nom , suivreroute);

    }

    /**
     * 2ème constructeur de la classe Monocoque
     * @param nom le nom du skipper
     * @param skipper le skipper qui pilote le voilier
     */
    public Monocoque(String nom , String skipper) {
        super(nom , skipper);
    }

    /**
     * La méthode toString renvoie un texte
     * @return renvoie le nom du voilier ainsi que son type
     */
    @Override
    public String toString() {
        return " Le nom est : " + nom + " Le bateau est de type : Monocoque ";
    }


}
