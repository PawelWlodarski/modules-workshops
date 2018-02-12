package com.exercise.printer.console;

import com.exercise.printer.Printer;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String s) {
        System.out.println("PRINTING: "+s);
    }
}

