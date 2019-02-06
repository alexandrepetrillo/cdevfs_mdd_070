package facturation.back;

import java.util.List;

public class FacturationServiceImpl implements FacturationService {
    @Override
    public double facturer(List<Article> articles) {
        double total = 0;
        for (Article article : articles) {
            total = total + article.getPrix();
        }
        return total;
    }
}
