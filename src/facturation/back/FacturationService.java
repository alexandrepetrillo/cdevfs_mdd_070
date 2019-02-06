package facturation.back;

import java.util.List;

public interface FacturationService {

    double facturer(List<Article> articles);
}
