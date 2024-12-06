package com.devtiro.quickstart.services.impl;

import com.devtiro.quickstart.services.BluePrinter;
import com.devtiro.quickstart.services.ColourPrinter;
import com.devtiro.quickstart.services.GreenPrinter;
import com.devtiro.quickstart.services.RedPrinter;
import com.devtiro.quickstart.services.impl.idiom.EnglishRedPrinter;
import com.devtiro.quickstart.services.impl.idiom.EnglishBluePrinter;
import com.devtiro.quickstart.services.impl.idiom.EnglishGreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;

        /*this.redPrinter = new EnglishRedPrinter();
        this.bluePrinter =  new EnglishBluePrinter();
        this.greenPrinter = new EnglishGreenPrinter();*/
    }

    @Override
    public String print(){
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }

}
