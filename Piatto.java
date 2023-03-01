package nuova;

public class Piatto {
    private String nome;
    private double prezzo;
    private String tipo;

    public Piatto(String nome, double prezzo, String tipo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getTipo() {
        return tipo;
    }
}