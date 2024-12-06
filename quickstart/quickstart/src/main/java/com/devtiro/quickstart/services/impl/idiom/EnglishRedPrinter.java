package com.devtiro.quickstart.services.impl.idiom;

import com.devtiro.quickstart.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {
    public String print(){
        return "red";
    }
}
