/**
 * La classe abstraite ArmementSupplementaire représente un décorateur pour les voiliers.
 * Elle permet d'ajouter des fonctionnalités supplémentaires à un objet Voilier existant.
 */
public abstract class  ArmementSupplementaire extends Voilier   {

    /** Le voilier décoré par cet armement supplémentaire. */
    Voilier composantadecore;


    /**
     * Constructeur de la classe ArmementSupplementaire.
     *
     * @param composantadecore Le voilier à décorer avec un armement supplémentaire.
     */
    public ArmementSupplementaire(Voilier composantadecore) {
        super();
        this.composantadecore = composantadecore;

    }

    /**
     * La méthode suivre route permet d'indiquer au voilier décorer quelle route suivre
     */
    public void appliqueSuivreRoute(){
        composantadecore.appliquerSuivreRoute();
    }

    /**
     * Définit une nouvelle stratégie de suivi de route pour le voilier décoré.
     *
     * @param suivreRoute La stratégie de suivi de route à appliquer.
     */
    public void setSuivreRoute(SuivreRoute suivreRoute) {
        composantadecore.setSuivreRoute(suivreRoute);
    }
}
