public class Monocoque extends Voilier {

    public Monocoque(String nom , SuivreRoute suivreroute , String skipper) {

        super(nom , suivreroute);

    }
    public Monocoque(String nom , String skipper) {
        super(nom , skipper);
    }

    @Override
    public String toString() {
        return " Le nom est : " + nom + " Le bateau est de type : Monocoque ";
    }


}
