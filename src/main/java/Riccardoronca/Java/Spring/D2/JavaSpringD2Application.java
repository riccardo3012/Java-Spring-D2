
package Riccardoronca.Java.Spring.D2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import entities.BeansConfiguration;

@SpringBootApplication
@Slf4j
public class JavaSpringD2Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringD2Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);


		System.out.println(ctx.getBean("getMenu"));
		ctx.close();
	}
}
