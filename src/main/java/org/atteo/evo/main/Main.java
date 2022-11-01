package org.atteo.evo.main;

import org.atteo.evo.inflector.English;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Empty!");
        }
        Arrays.stream(args).forEach(arr -> {
            System.out.println(English.plural(arr));
        });
    }
}
