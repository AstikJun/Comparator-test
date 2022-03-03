package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<String>();
       names.add("Astan Serikov");
       names.add("Asel Alybaeva");
       names.add("Adilet Torobaev");
       names.add("Kira Test");
       names.add("Zenitsu Zenli");
       names.add("Jordan Michael");

        System.out.println("Set before using the comparator: " + names);

        TreeSet<String> ordered = new TreeSet<String>(new Comp());

        ordered.add("Astan Serikov");
        ordered.add("Asel Alybaeva");
        ordered.add("Asel test");
        ordered.add("Adilet Torobaev");
        ordered.add("Kira Test");
        ordered.add("Zenitsu Zenli");
        ordered.add("Jordan Michael");

        
        System.out.println("The elements sorted in descending order:" + ordered);












    }
}
