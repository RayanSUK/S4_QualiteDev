/**
 * L'interface SuivreRoute définit une stratégie de suivi de route pour un voilier.
 * Toute classe qui implémente cette interface doit fournir une implémentation de la méthode suivreRoute().
 */
public interface SuivreRoute {
    /**
     * Applique la stratégie de suivi de route.
     * Les classes implémentant cette interface doivent définir le comportement spécifique.
     */
    public void suivreRoute();

}
