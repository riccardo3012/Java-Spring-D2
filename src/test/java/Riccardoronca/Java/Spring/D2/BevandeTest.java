package Riccardoronca.Java.Spring.D2;
import Riccardoronca.Java.Spring.D2.entities.Bevande;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
@Slf4j

public class BevandeTest {
    static Bevande testBevande;
    private  static AnnotationConfigApplicationContext ctx;

    @BeforeAll
    static void beforeAll(){
        log.info("beforeall");
        ctx = new AnnotationConfigApplicationContext(JavaSpringD2Application.class);
        testBevande = (Bevande) ctx.getBean("getAcqua");
    }
    @Test
    public void testWaterNotNull(){
        assertNotNull(testBevande);
    }

}