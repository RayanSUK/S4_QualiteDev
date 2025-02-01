public class Velo extends ArmementSupplementaire{



    public Velo(Voilier composantadecore){
        super(composantadecore);
    }
    public String toString(){
        return composantadecore.toString() + " Armement vélo ";
    }

}
