package Riccardoronca.Java.Spring.D2.entities;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
@PropertySource("application.properties")
public class Tavolo {
    private int nTavolo;
    private int nPosti;
    private StatoTavolo statoTavolo;

    public Tavolo(@Value("6") int nTavolo, @Value("8") int nPosti, @Value("PRENOTATO") String statoTavolo)  {
        this.nTavolo = nTavolo;
        this.nPosti = nPosti;
        this.statoTavolo = StatoTavolo.valueOf(statoTavolo);
    }
}



