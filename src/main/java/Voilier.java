public abstract class Voilier {
    String nom;

    SuivreRoute suivreRoute; // le chp suivreroute appartient à 1 classe qui implemente l'interface suivreRoute

    String skipper ;

    public Voilier(String nom , String skipper) {
        this.nom = nom;
        this.skipper = skipper;

    }

    public Voilier(String nom , SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;

    }

    public Voilier() {

    }

    public String getNom() {
        return nom;
    }

    public void setSuivreRoute(SuivreRoute sr) {
        this.suivreRoute = sr;
    }

    public void appliquerSuivreRoute(){
        this.suivreRoute.suivreRoute();
    }

}
