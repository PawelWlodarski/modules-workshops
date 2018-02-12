package com.jug.modules.intro.displayer;

import com.jug.modules.intro.math.MathLib;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;


public class Displayer {

    private static Consumer<Integer> printResult=(i) -> System.out.println("result is : "+i);
    private static Runnable errorProcedure = () -> System.out.println("unable to add integeres, overflow");

    public static void displayMath(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("i1 : ");
        Integer i1=scanner.nextInt();
        System.out.print("i2 : ");
        Integer i2=scanner.nextInt();


        Optional<Integer> result = MathLib.add(i1, i2);

        result.ifPresentOrElse(printResult,errorProcedure);
    }

    public static void main(String[] args) {
        displayMath();
    }
}
