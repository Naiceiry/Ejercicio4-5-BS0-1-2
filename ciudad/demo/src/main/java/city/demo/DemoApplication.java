package city.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

		@Bean
		public  ArrayList<Beanciudad> listaciudades(){

			ArrayList<Beanciudad> listaciudad =  new ArrayList<Beanciudad>();
			return listaciudad;
		}


}
