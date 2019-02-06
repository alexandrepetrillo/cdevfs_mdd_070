package facturation;


import facturation.back.FacturationServiceImpl;
import facturation.front.EcranFacturation;

public class Main {
    public static void main(String... args) {
        EcranFacturation ecranFacturation = new EcranFacturation();
        FacturationServiceImpl facturationService = new FacturationServiceImpl();
        ecranFacturation.setFacturationService(facturationService);

        ecranFacturation.init();
        ecranFacturation.afficherFacturer();
    }
}
