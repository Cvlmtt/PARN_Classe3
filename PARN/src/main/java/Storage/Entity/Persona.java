package Storage.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;
import java.util.List;
@Entity
public class Persona extends Utente {

    private String cognome;
    private String codiceFiscale;
    private String filtroMacroarea;
    private String posizioneDesiderata;
    private LocalDateTime dataDiNascita;
    @OneToOne
    private Curriculum curriculum;
    @OneToMany
    private List<Candidatura> candidature;

    public Persona(String nome, String mail, String password, String regione, String provincia, String cap, String citta, String via, String telefono, String foto, String cognome, String codiceFiscale, String filtroMacroarea, String posizioneDesiderata, Curriculum curriculum, List<Candidatura> candidature, LocalDateTime dataDiNascita) {
        super(nome, mail, password, regione, provincia, cap, citta, via, telefono, foto);
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.filtroMacroarea = filtroMacroarea;
        this.posizioneDesiderata = posizioneDesiderata;
        this.curriculum = curriculum;
        this.candidature = candidature;
        this.dataDiNascita = dataDiNascita;
    }

    public Persona() {

    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getFiltroMacroarea() {
        return filtroMacroarea;
    }

    public void setFiltroMacroarea(String filtroMacroarea) {
        this.filtroMacroarea = filtroMacroarea;
    }

    public String getPosizioneDesiderata() {
        return posizioneDesiderata;
    }

    public void setPosizioneDesiderata(String posizioneDesiderata) {
        this.posizioneDesiderata = posizioneDesiderata;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public List<Candidatura> getCandidature() {
        return candidature;
    }

    public void setCandidature(List<Candidatura> candidature) {
        this.candidature = candidature;
    }

    public LocalDateTime getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDateTime dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
