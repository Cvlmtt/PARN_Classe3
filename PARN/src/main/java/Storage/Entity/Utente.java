package Storage.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public abstract class Utente {
    private String nome;
    private String mail;
    private String password;
    private String regione;
    private String provincia;
    private String cap;
    private String citta;
    private String via;
    private String telefono;
    private String foto;
    private Long id;

    public Utente(String nome, String mail, String password, String regione, String provincia, String cap, String citta, String via, String telefono, String foto) {
        this.nome = nome;
        this.mail = mail;
        this.password = password;
        this.regione = regione;
        this.provincia = provincia;
        this.cap = cap;
        this.citta = citta;
        this.via = via;
        this.telefono = telefono;
        this.foto = foto;
    }

    public Utente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
