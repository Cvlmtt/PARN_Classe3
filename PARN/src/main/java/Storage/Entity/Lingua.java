package Storage.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Lingua {

    private String Nome;
    private String Livello;
    private Long id;

    public Lingua() {
    }

    public Lingua(String nome, String livello) {
        Nome = nome;
        Livello = livello;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getLivello() {
        return Livello;
    }

    public void setLivello(String livello) {
        Livello = livello;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
