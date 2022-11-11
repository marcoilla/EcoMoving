package hackaton.demo.ecomoving.model;

import java.util.Date;

public class Utente {
    // attributi
    private String username;
    private String password;
    private String email;
    private Date dataDiNascita;
    private String nome;
    private String cognome;

    // costruttore
    public Utente(String username, String password, String email, Date dataDiNascita, String nome, String cognome) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.nome = nome;
        this.cognome = cognome;
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

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
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
}
