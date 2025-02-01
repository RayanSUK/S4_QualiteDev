public class Foil extends ArmementSupplementaire {

    public Foil(Voilier composantadecore){
        super(composantadecore);
    }

    public String toString(){
        return composantadecore.toString() + " Armement foil ";
    }
}
