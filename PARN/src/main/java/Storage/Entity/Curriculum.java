package Storage.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Curriculum {
    @ElementCollection
    private List<String> softSkill;
    @OneToMany
    private List<EsperienzaLavorativa> esperienze;
    @OneToMany
    private List<Lingua> lingue;
    @OneToMany
    private List<Istruzione> istruzioni;
    @OneToOne
    private Persona persona;
    private Long id;

    public Curriculum(List<String> softSkill, List<EsperienzaLavorativa> esperienze, List<Lingua> lingue, List<Istruzione> istruzioni, Persona persona) {
        this.softSkill = softSkill;
        this.esperienze = esperienze;
        this.lingue = lingue;
        this.istruzioni = istruzioni;
        this.persona = persona;
    }

    public Curriculum() {

    }

    public List<String> getSoftSkill() {
        return softSkill;
    }

    public void setSoftSkill(List<String> softSkill) {
        this.softSkill = softSkill;
    }

    public List<EsperienzaLavorativa> getEsperienze() {
        return esperienze;
    }

    public void setEsperienze(List<EsperienzaLavorativa> esperienze) {
        this.esperienze = esperienze;
    }

    public List<Lingua> getLingue() {
        return lingue;
    }

    public void setLingue(List<Lingua> lingue) {
        this.lingue = lingue;
    }

    public List<Istruzione> getIstruzioni() {
        return istruzioni;
    }

    public void setIstruzioni(List<Istruzione> istruzioni) {
        this.istruzioni = istruzioni;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
