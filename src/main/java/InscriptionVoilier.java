import java.util.LinkedList;
import java.util.List;

public abstract class InscriptionVoilier {
   static List<Voilier> voiliers;

    public InscriptionVoilier() {
        voiliers = new LinkedList<>();

    }
    public void enregistrerVoilier(Voilier voilier) {
        voiliers.add(voilier);
    }

    public abstract Voilier factoryMethod(String nom , String skipper , String categorie );


}
