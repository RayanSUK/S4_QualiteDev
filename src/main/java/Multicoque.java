public class Multicoque extends Voilier{

    public Multicoque(String nom , String skipper) {
        super(nom , skipper);
    }

    public Multicoque(String nom, SuivreRoute suivreRoute) {
        super(nom, suivreRoute);
    }



    public String toString() {
        return " le nom est : " + nom + " le type du bateau est : Multicoque " ;
    }



}
