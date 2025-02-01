/**
 * La classe Voilier représente un voilier de course avec un skipper et une stratégie de suivi de route
 */
public abstract class Voilier {

    /** Le nom du voilier*/
    String nom;

    /** La route a suivre */

    SuivreRoute suivreRoute; // le chp suivreroute appartient à 1 classe qui implemente l'interface suivreRoute

    /** Le nom du Skipper qui pilote le voilier*/
    String skipper ;

    /**
     * 1 er Constructeur de la classe Voilier
     * @param nom le nom du voilier
     * @param skipper le skipper qui pilote le voilier
     */
    public Voilier(String nom , String skipper) {
        this.nom = nom;
        this.skipper = skipper;

    }

    /**
     * 2ème constructeur de la classe voilier
     * @param nom le nom du voilier
     * @param suivreRoute la route à suivre
     */
    public Voilier(String nom , SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;

    }

    /**
     * 3ème Cconstructeur de la classe voilier (constructeur vide )
     */
    public Voilier() {

    }

    /**
     * La méthode toString retourne le nom du voilier
     * @return le nom du voilier
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit une nouvelle stratégie de suivi de route pour le voilier.
     *
     * @param sr La nouvelle stratégie de suivi de route à appliquer.
     */
    public void setSuivreRoute(SuivreRoute sr) {
        this.suivreRoute = sr;
    }

    /**
     * Applique la stratégie de suivi de route actuelle du voilier.
     */
    public void appliquerSuivreRoute(){
        this.suivreRoute.suivreRoute();
    }

}
