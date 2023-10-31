package entities;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Tavolo {
    private int nTavolo;
    private int nPosti;
    private StatoTavolo statoTavolo;

    public Tavolo(int nTavolo, int nPosti, StatoTavolo statoTavolo) {
        this.nTavolo = nTavolo;
        this.nPosti = nPosti;
        this.statoTavolo = statoTavolo;
    }

    public enum StatoTavolo {
        PRENOTATO, DISPONIBILE
    }

}
