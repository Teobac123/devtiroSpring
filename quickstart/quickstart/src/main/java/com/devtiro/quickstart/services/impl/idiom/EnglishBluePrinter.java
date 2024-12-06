package com.devtiro.quickstart.services.impl.idiom;

import com.devtiro.quickstart.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {

    public String print(){
        return "blue";
    }
}
