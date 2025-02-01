/**
 * La classe Class40 représente un voilier de type Class 40, qui est une sous-catégorie des monocoques.
 * Elle hérite de la classe Monocoque et ajoute une spécification de type.
 */
public class Class40 extends Monocoque{


    /**
     * Constructeur de la classe Class40
     * @param nom le nom du voilier
     * @param skipper le nom du skipper qui pilote le voilier
     */
    public Class40(String nom, String skipper) {
        super(nom , skipper);



    }

    /**
     * La méthode toString renvoie un texte contenant le type du voilier et ses informations de base
     * @return la classe du voilier et ses informations de base.
     */
    public String toString(){
        return "Class40" + super.toString();
    }
}
