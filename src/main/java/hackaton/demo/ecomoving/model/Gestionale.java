package hackaton.demo.ecomoving.model;

import java.util.ArrayList;

public class Gestionale {
    // variabili
    private ArrayList<Utente> listaUtenti;

    public Gestionale() {
        this.listaUtenti = new ArrayList<>();
    }

    public void addUtente(Utente u){
        listaUtenti.add(u);
    }

    public boolean checkLogin(String username, String password) {
        for(Utente u : listaUtenti){
            if(u.getUsername().equals(username)) {
                if(u.getPassword().equals(password)){
                    return true;
                }
            }
        }

        return false;
    }

    // check sign up è la funzione che verifica che l'utente inserito non contenga un username o una mail già utilizzate
    // ritorna TRUE se si può andare AVANTI
    // ritorna FALSE se se NON SI PUO PROSEGUIRE
    public boolean checkSignUp (Utente u){
        for(Utente utente : listaUtenti) {
            if(utente.getEmail().equals(u.getEmail()) || utente.getUsername().equals(u.getUsername())){
                return false;
            }
        }
        return true;
    }
}
