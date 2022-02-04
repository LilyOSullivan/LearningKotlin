package com.lily.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class JavaExamples {

    public static Function<String, String> toSentenceCase =
            x -> x.substring(0, 1).toUpperCase() + x.substring(1);

    public static String applySomeFunctionToString(String input, Function<String, String> myFunction) {
        return myFunction.apply(input);
    }

    public static void main(String[] args) {
        String result = applySomeFunctionToString("hello", x -> x.toUpperCase());
        System.out.println(result);

        List<String> colours = new ArrayList<String>() {{
            add("red");
            add("green");
            add("blue");
            add("black");
        }};
        List<String> upperCaseColours = new ArrayList<String>();
        for (String colour : colours) {
            upperCaseColours.add(colour.toUpperCase());
        }

        for (String colour : upperCaseColours) {
            System.out.println(colour);
        }
    }
}
