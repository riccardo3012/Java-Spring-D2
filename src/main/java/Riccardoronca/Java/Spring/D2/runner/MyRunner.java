package Riccardoronca.Java.Spring.D2.runner;
import Riccardoronca.Java.Spring.D2.JavaSpringD2Application;
import Riccardoronca.Java.Spring.D2.entities.Ordinazione;
import Riccardoronca.Java.Spring.D2.entities.Ordini;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
@Slf4j
@Order(1)
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... arg) throws Exception
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaSpringD2Application.class);
        List<Ordinazione> menuList = new ArrayList<>(Arrays.asList( (Ordinazione) ctx.getBean("getAmericana"), (Ordinazione) ctx.getBean("getSoda")));
        Ordini ordinazioneN1 = (Ordini) ctx.getBean("ordine");

        ordinazioneN1.setOrdine(menuList);
        ordinazioneN1.total();
        log.info (ordinazioneN1.toString());
        ctx.close();


    }
}
