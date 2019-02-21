package arbre;

import java.util.Iterator;

public class ArbreBinaire implements Iterable<ArbreBinaire> {
    String etiquette;
    private ArbreBinaire gauche;
    private ArbreBinaire droit;

    public ArbreBinaire(String etiquette, ArbreBinaire gauche, ArbreBinaire droit) {
        this.etiquette = etiquette;
        this.gauche = gauche;
        this.droit = droit;
    }

    @Override
    public Iterator<ArbreBinaire> iterator() {
        return new ArbreBinaireProfondeurDAbordIterator(this);
        //return new ArbreBinaireLargeurDAbordIterator(this);
    }

    public String getEtiquette() {
        return etiquette;
    }

    public void setEtiquette(String etiquette) {
        this.etiquette = etiquette;
    }

    public ArbreBinaire getGauche() {
        return gauche;
    }

    public void setGauche(ArbreBinaire gauche) {
        this.gauche = gauche;
    }

    public ArbreBinaire getDroit() {
        return droit;
    }

    public void setDroit(ArbreBinaire droit) {
        this.droit = droit;
    }

    @Override
    public String toString() {
        return "ArbreBinaire{" +
                "etiquette='" + etiquette + '\'' +
                '}';
    }
}
