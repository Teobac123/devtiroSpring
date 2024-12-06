package com.devtiro.quickstart.services.impl.idiom;

import com.devtiro.quickstart.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {

    public String print(){
        return "green";
    }
}
