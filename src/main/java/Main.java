public class Main {
    public static void main(String[] args) {
        /*

        SuivreRoute routeAlize1 = new RouteAlize();
        Multicoque multicoque1 = new Multicoque("multicoque1" , routeAlize1);
        multicoque1.appliquerSuivreRoute();




        Voilier m2 = new Multicoque("multicoquem2");
        m2.setSuivreRoute(routeAlize1);
        m2.appliquerSuivreRoute();
        m2 = new Velo(m2);
        System.out.println(m2);
        System.out.println(m2);
        Foil foil2 = new Foil(m2);
        System.out.println(foil2);
        m2.appliquerSuivreRoute();
        System.out.println(m2);




 */
        InscriptionVoilier inscripriopn1 = new InscriptionMonocoque();
        Voilier voilier1 = inscripriopn1.factoryMethod("bateau1", "driver1" , "Class40");
        System.out.println(voilier1.toString());


        InscriptionVoilier inscripriopn2 = new InscriptionMulticoque();
        Voilier voilier2 = inscripriopn2.factoryMethod("bateau2", "driver2", "Multi50");
        inscripriopn2.enregistrerVoilier(voilier1);
        System.out.println(voilier1.toString());


        inscripriopn2.enregistrerVoilier(voilier2);
        System.out.println(InscriptionVoilier.voiliers);



    }
}