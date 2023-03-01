package nuova;
public class Utente {
    private static String nome;
    private int id;
    private static Conto conto;

    public Utente(String nome, int id) {
        this.nome = nome;
        this.id = id;
        conto = new Conto();
    }

    public static String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public static void aggiungiPiatto(Piatto piatto) {
        conto.aggiungiPiatto(piatto);
    }

    public static Conto getConto() {
        return conto;
    }
}