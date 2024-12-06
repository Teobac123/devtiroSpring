package com.devtiro.quickstart.config;

import com.devtiro.quickstart.services.BluePrinter;
import com.devtiro.quickstart.services.ColourPrinter;
import com.devtiro.quickstart.services.GreenPrinter;
import com.devtiro.quickstart.services.RedPrinter;
import com.devtiro.quickstart.services.impl.ColourPrinterImpl;
import com.devtiro.quickstart.services.impl.idiom.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class PrinterConfig {

    /*@Bean
    public BluePrinter bluePrinter(){
        return new SpanishBluePrinter();
    }
    @Bean
    public RedPrinter redPrinter(){
        return new SpanishRedPrinter();
    }
    @Bean
    public GreenPrinter greenPrinter(){
        return new SpanishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        return new ColourPrinterImpl(redPrinter,bluePrinter,greenPrinter);

    }*/
}
