package Riccardoronca.Java.Spring.D2.entities;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@Component("order_component")
@PropertySource("application.properties")

public class Ordini {
    private int nOrdine;
    private int nPosti;
    private StatoOrdine statoOrdine;
    private LocalDateTime orarioPrenotazione;
    private double importoTot;
    private List<Ordinazione> ordine;
    private Tavolo tavolo;
    @Value("${coperto}")
    private double coperto;

    public void setOrdine(List<Ordinazione> ordine) {
        this.ordine = ordine;
    }

    public Ordini( Tavolo tavolo, @Value("4") int coperto) {
        Random rndm = new Random();
        this.nOrdine = rndm.nextInt(1, 200);
        this.nOrdine = nOrdine;
        this.nPosti =rndm.nextInt(2, 8);
        this.statoOrdine = StatoOrdine.IN_CORSO;
        this.orarioPrenotazione = LocalDateTime.now();
        this.importoTot = importoTot;
        this.ordine = ordine;
        this.tavolo = tavolo;

    }

    public void total() {
        ordine.forEach(elem -> this.importoTot = this.importoTot + elem.getPrezzo());
        this.importoTot = this.importoTot + (nPosti * coperto);

    }

    @Override
    public String toString() {
        return "Ordine{" +
                "ordine=" + nOrdine +
                ", tavolo=" + tavolo +
                ", menu=" + ordine +
                ", stato dell'ordine=" + statoOrdine +
                ", numero di coperti=" + nPosti +
                ", orario di prenotazione=" + orarioPrenotazione +
                ", importo totale=" + importoTot +
                '}';

    }
}



