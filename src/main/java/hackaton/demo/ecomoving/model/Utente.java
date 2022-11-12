package hackaton.demo.ecomoving.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Utente {
    // attributi
    private String username;
    private String password;
    private String email;
    private LocalDate dataDiNascita;
    private String nome;
    private String cognome;

    private String luogoDiResidenza;

    private String luogoDiLavoro;

    private boolean canSmartWork;

    private ArrayList<String> mezziTrasporto;

    // costruttore
    public Utente(String username, String password, String email, LocalDate dataDiNascita, String nome, String cognome) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.nome = nome;
        this.cognome = cognome;
        this.mezziTrasporto = new ArrayList<>();
    }

    // getter e setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getLuogoDiResidenza() {
        return luogoDiResidenza;
    }

    public void setLuogoDiResidenza(String luogoDiResidenza) {
        this.luogoDiResidenza = luogoDiResidenza;
    }

    public String getLuogoDiLavoro() {
        return luogoDiLavoro;
    }

    public void setLuogoDiLavoro(String luogoDiLavoro) {
        this.luogoDiLavoro = luogoDiLavoro;
    }

    public ArrayList<String> getMezziTrasporto() {
        return mezziTrasporto;
    }

    public void setMezziTrasporto(ArrayList<String> mezziTrasporto) {
        this.mezziTrasporto = mezziTrasporto;
    }

    public boolean isCanSmartWork() {
        return canSmartWork;
    }

    public void setCanSmartWork(boolean canSmartWork) {
        this.canSmartWork = canSmartWork;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", luogoDiResidenza='" + luogoDiResidenza + '\'' +
                ", luogoDiLavoro='" + luogoDiLavoro + '\'' +
                ", canSmartWork=" + canSmartWork +
                ", mezziTrasporto=" + mezziTrasporto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return username.equals(utente.username) && password.equals(utente.password) && email.equals(utente.email) && dataDiNascita.equals(utente.dataDiNascita) && nome.equals(utente.nome) && cognome.equals(utente.cognome) && luogoDiResidenza.equals(utente.luogoDiResidenza) && luogoDiLavoro.equals(utente.luogoDiLavoro) && mezziTrasporto.equals(utente.mezziTrasporto);
    }
}
