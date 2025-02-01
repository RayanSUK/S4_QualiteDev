public abstract class  ArmementSupplementaire extends Voilier   {
    Voilier composantadecore;

    public ArmementSupplementaire(Voilier composantadecore) {
        super();
        this.composantadecore = composantadecore;

    }
    public void appliqueSuivreRoute(){
        composantadecore.appliquerSuivreRoute();
    }
    public void setSuivreRoute(SuivreRoute suivreRoute) {
        composantadecore.setSuivreRoute(suivreRoute);
    }
}
