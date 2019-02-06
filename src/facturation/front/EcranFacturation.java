package facturation.front;

import facturation.back.Article;
import facturation.back.FacturationService;

import java.util.ArrayList;
import java.util.List;

public class EcranFacturation {

    FacturationService facturationService = null;

    public void setFacturationService(FacturationService facturationService) {
        this.facturationService = facturationService;
    }

    List<Article> panier = new ArrayList<>();

    public void init() {

        panier.add(new Article("Pomme", 1));
        panier.add(new Article("Navet", 0.5));
    }

    public void afficherFacturer() {
        System.out.println("Vous avez dans votre panier");
        for (Article article : panier) {
            System.out.println(article.getLibelle());
        }
        System.out.println("Vous devez payer : ..." + facturationService.facturer(panier));
    }


}
