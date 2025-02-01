import java.util.List;

public class InscriptionMonocoque extends InscriptionVoilier{

    public InscriptionMonocoque(){
        super();
    }

    public Voilier factoryMethod(String nom , String skipper , String compare) {
        if (compare == "Class40"){
            return new Class40(nom , skipper);

        }

        if (compare == "Imoca"){
            return new Imoca(nom , skipper);
        }
        if (compare == "RhumMono"){
            return new RhumMono(nom , skipper);

        }


        return null;
    }
}
