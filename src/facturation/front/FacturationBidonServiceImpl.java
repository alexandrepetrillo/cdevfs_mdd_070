package facturation.front;

import facturation.back.Article;
import facturation.back.FacturationService;

import java.util.List;

public class FacturationBidonServiceImpl implements FacturationService {
    @Override
    public double facturer(List<Article> articles) {
        return 20;
    }
}
