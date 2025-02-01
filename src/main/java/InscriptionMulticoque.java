public class InscriptionMulticoque extends InscriptionVoilier{


    public InscriptionMulticoque(){
        super();
    }

    public Voilier factoryMethod(String nom , String skipper , String compare) {
        if (compare == "Multi50"){
            return new Multi50(nom , skipper);

        }

        if (compare == "Ultim"){
            return new Ultim(nom , skipper);
        }
        if (compare == "RhumMulti"){
            return new RhumMulti(nom , skipper);

        }


        return null;
    }
}
