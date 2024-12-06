package com.devtiro.quickstart;

import com.devtiro.quickstart.services.ColourPrinter;
import com.devtiro.quickstart.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
//import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
//@Slf4j
public class ColoursApplication implements CommandLineRunner {


	private ColourPrinter colourPrinter;

	public ColoursApplication(ColourPrinter colourPrinter){
		this.colourPrinter = colourPrinter;
	}
	public static void main(String[] args) {
		SpringApplication.run(ColoursApplication.class, args);
	}

	@Override
	public void run(final String... args){
     	 //final ColourPrinter colourPrinter = new ColourPrinterImpl();
		 log.info(colourPrinter.print());
	}
}
