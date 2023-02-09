package Storage.Entity;

public class Lingua {

    private String Nome;
    private String Livello;

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
}
