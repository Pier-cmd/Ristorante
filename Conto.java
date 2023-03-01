package nuova;

import java.util.ArrayList;

public class Conto {
    private ArrayList<Piatto> piatti;

    public Conto() {
        piatti = new ArrayList<Piatto>();
    }

    public void aggiungiPiatto(Piatto piatto) {
        piatti.add(piatto);
    }

    public ArrayList<Piatto> getPiatti() {
        return piatti;
    }

    public double getTotale() {
        double totale = 0;
        for (Piatto piatto : piatti) {
            totale += piatto.getPrezzo();
        }
        return totale;
    }
}