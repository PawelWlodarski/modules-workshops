package com.exercise.printer;


import com.exercise.printer.console.ConsolePrinter;

public abstract class AbstractFactoryPrinterProviderBean {
    public static Printer providePrinter(){
        return new ConsolePrinter();
    }
}
