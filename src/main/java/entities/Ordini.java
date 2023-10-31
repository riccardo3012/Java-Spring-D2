package entities;
import java.time.LocalDateTime;
import java.util.List;

public class Ordini {
    private int nOrdine;
    private int nPosti;
    private StatoOrdine statoOrdine;
    private LocalDateTime orarioPrenotazione;
    private double importoTot;
    private List<Ordinazione> ordine;


    public Ordini(int nOrdine, int nPosti, StatoOrdine statoOrdine, LocalDateTime orarioPrenotazione, double importoTot, List<Ordinazione> ordine) {
        this.nOrdine = nOrdine;
        this.nPosti = nPosti;
        this.statoOrdine = statoOrdine;
        this.orarioPrenotazione = orarioPrenotazione;
        this.importoTot = importoTot;
        this.ordine = ordine;
    }
        public enum StatoOrdine {
        IN_CORSO, PRONTO, SERVITO
        }

   
}
