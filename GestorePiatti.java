package nuova;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GestorePiatti {
    public static void main(String[] args) {
        // Creazione dei piatti
        Piatto pizza = new Piatto("Pizza margherita", 4.00, "Pizza");
        Piatto pasta = new Piatto("Melanzane al forno", 12.00, "Primo");
        Piatto tiramisu = new Piatto("Nutella cake", 5.00, "Dolce");

        List<Utente> utentiRegistrati = new ArrayList<>();
        while(true){

        // Scelta tra registrazione e login
        Scanner input = new Scanner(System.in);
        System.out.println("1. Registrati");
        System.out.println("2. Login");
        System.out.print("Scelta: ");
        int scelta = input.nextInt();

        if (scelta == 1) {
            // Registrazione di un nuovo utente
            System.out.print("Inserisci il tuo nome: ");
            String nomeUtente = input.next();
            int idUtente = new Random().nextInt(100000);
            Utente utente = new Utente(nomeUtente, idUtente);
            utentiRegistrati.add(utente);
            System.out.println("Registrazione avvenuta con successo. Il tuo id utente è: " + idUtente);

        } else if (scelta == 2) {
            // Login di un utente registrato
            System.out.print("Inserisci il tuo id utente: ");
            int idUtente = input.nextInt();
            Utente utente = null;
            for (Utente u : utentiRegistrati) {
                if (u.getId() == idUtente) {
                    utente = u;
                    break;
                }
            }
            if (utente == null) {
                System.out.println("Utente non trovato");
                return;
            } else {
                System.out.println("Benvenuto " + Utente.getNome());
            }
        } else {
            System.out.println("Scelta non valida");
            return;
        }
        // Scelta del piatto
        System.out.println("Scegli il piatto:");
        System.out.println("1. Pizza margherita");
        System.out.println("2. Melanzane al forno");
        System.out.println("3. Tiramisù");

        System.out.print("Inserisci il numero del piatto: ");
        int sceltaPiatto = input.nextInt();

        switch (sceltaPiatto) {
            case 1:
                Utente.aggiungiPiatto(pizza);
                break;
            case 2:
                Utente.aggiungiPiatto(pasta);
                break;
            case 3:
                Utente.aggiungiPiatto(tiramisu);
                break;
            default:
                System.out.println("Scelta non valida");
                break;
        }

        // Stampa del conto
        System.out.println("Conto di " + Utente.getNome() + ":");
        for (Piatto piatto : Utente.getConto().getPiatti()) {
            System.out.println(piatto.getNome() + " (" + piatto.getTipo() + "): " + piatto.getPrezzo() + " euro");
        }
        System.out.println("Totale: " + Utente.getConto().getTotale() + " euro");



        System.out.println("Cosa vuoi fare?");
        System.out.println("1. Esci");
        System.out.println("2. Torna al login");
        System.out.print("Scelta: ");
        int sceltaMenu = input.nextInt();

        if (sceltaMenu == 1) {
            System.out.println("Grazie per aver utilizzato il nostro servizio. Arrivederci!");
            return;
        } else if (sceltaMenu == 2) {
            System.out.println("Tornando al login...");
            continue;
        } else {
            System.out.println("Scelta non valida. Uscita dal programma.");
            return;
        }
    }

    }
}
