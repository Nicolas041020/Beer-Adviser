package unipiloto.edu.co.beeradviser;

import java.util.ArrayList;
import java.util.List;

public abstract class BeerExpert {

    public BeerExpert() {
    }

    public static List<String> getBrands(String color){
        List arr = new ArrayList<String>();

    switch (color){
        case "light":
            arr.add("Jail Pale Ale");
            arr.add("gout Stout");
            break;
        case "amber" :
            arr.add("Jack Amber");
            arr.add("Red Moose");
            break;
        case "brown":
            arr.add("Julian Nova");
            arr.add("Tomas Vera");
            break;
        case "dark" :
            arr.add("Felipe Trivino");
            arr.add("Luis Romero");
            break;
    }

        return arr;
    }

    public static List<String> getRaces(String Race){
        List arr = new ArrayList<String>();
        switch(Race){
            case "Pastor":
                arr.add("Pastor Catalán");
                arr.add("Pastor Alemán");
                arr.add("Julian Komodor");
                arr.add("Pastor Australiano");
                break;
            case "Pinscher":
                arr.add("Dobermann");
                arr.add("Pinscher Alemán");
                arr.add("Pinscher Miniatura");
                arr.add("Schnauzer");
                break;
        }
        return arr;
    }
}
