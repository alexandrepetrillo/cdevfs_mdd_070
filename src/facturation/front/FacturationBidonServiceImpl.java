package facturation.front;

import back.Article;
import back.FacturationService;

import java.util.List;

public class FacturationBidonServiceImpl implements FacturationService {
    @Override
    public double facturer(List<Article> articles) {
        return 20;
    }
}
