package com.dectiro.starter;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class StarterApplication implements CommandLineRunner {

	private PizzaConfig pizzaConfig;

	public StarterApplication(PizzaConfig pizzaConfig){
		this.pizzaConfig = pizzaConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}


	@Override
	public void run(String... args){
		//final PizzaConfig pizzaConfig = new PizzaConfig("thin", "mozzarella","tomato");
		log.info(
				String.format("I want a %s crust pizza, with  %s and %s sauce",
						pizzaConfig.getCrust(),
						pizzaConfig.getTopping(),
						pizzaConfig.getSauce()
				)
		);
	}


}
