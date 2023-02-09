package Storage.Entity;

import java.util.ArrayList;
import java.util.List;

public class Azienda extends Utente{
    private String partitaIVA;
    private String ragioneSociale;
    private String link;
    private String areaInteresse;
    private int numeroDipendenti;
    private List<String> settoriCompetenza;
    private List<Sede> sedi;
    private List<Annucio> annunci;


    public Azienda(String nome, String mail, String password, String regione, String provincia, int cap, String citta, String via, Long telefono, String foto, String partitaIVA, String ragioneSociale, String link, String areaInteresse, int numeroDipendenti, List<String> settoriCompetenza, List<Sede> sedi, List<Annucio> annunci) {
        super(nome, mail, password, regione, provincia, cap, citta, via, telefono, foto);
        this.partitaIVA = partitaIVA;
        this.ragioneSociale = ragioneSociale;
        this.link = link;
        this.areaInteresse = areaInteresse;
        this.numeroDipendenti = numeroDipendenti;
        this.settoriCompetenza = settoriCompetenza;
        this.sedi = sedi;
        this.annunci = annunci;
    }
}
