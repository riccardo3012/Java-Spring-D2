package Riccardoronca.Java.Spring.D2;

import Riccardoronca.Java.Spring.D2.entities.Topping;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
public class ToppingTest{
    static Topping toppingsTest;
    private static AnnotationConfigApplicationContext ctx;

    @BeforeAll
    static void beforeAll() {
        log.info("beforeAll");
        ctx = new AnnotationConfigApplicationContext(JavaSpringD2Application.class);
        toppingsTest = (Topping) ctx.getBean("getWustel");
    }

    @Test
    public void testToppingNotNull() {
        assertNotNull(toppingsTest);
    }
}