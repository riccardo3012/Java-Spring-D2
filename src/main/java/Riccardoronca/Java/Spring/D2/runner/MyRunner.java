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
        List<Ordinazione> elementiMenuList = new ArrayList<>();


        Ordini ordinen1 = (Ordini) ctx.getBean("order_component");

        ordinen1.setOrdine(elementiMenuList);
        ordinen1.total();
        log.info(ordinen1.toString());
        ctx.close();


    }
}
