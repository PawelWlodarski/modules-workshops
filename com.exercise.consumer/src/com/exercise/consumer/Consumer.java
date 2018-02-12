package com.exercise.consumer;

import com.exercise.printer.AbstractFactoryPrinterProviderBean;
import com.exercise.printer.Printer;
import com.exercise.producer.Producer;

import java.util.stream.Collectors;

public class Consumer {
    public static void main(String[] args) {
        String result=Producer.produce().stream().collect(Collectors.joining("|"));

        Printer printer=AbstractFactoryPrinterProviderBean.providePrinter();

        printer.print(result);
    }
}
