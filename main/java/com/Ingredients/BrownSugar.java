package com.Ingredients;

public class BrownSugar extends Ingredient{

    private double conversionFactor = 220.0;
    private String name = "Brown Sugar";

    public BrownSugar(){
        super();
    }

    public String getName() {
        return this.name;
    }

    public BrownSugar(double conversionFactor, String name) {
        super();
        this.conversionFactor = conversionFactor;
        this.name = name;
    }

    public double getConversionsFactor() {
        return this.conversionFactor;
    }

    public int teaspoonsToGrams(Ingredient ingredient, double teaspoons) {
        double tspGrams = teaspoons * (conversionFactor / 48);
        long convertGrams = Math.round(tspGrams);
        int grams = Math.toIntExact(convertGrams);
        return grams;
    }

    public int tablespoonsToGrams(Ingredient ingredient, double tablespoons) {
        double tbspGrams = tablespoons * (conversionFactor / 16);
        long convertGrams = Math.round(tbspGrams);
        int grams = Math.toIntExact(convertGrams);
        return grams;
    }

    public int cupsToGrams(Ingredient ingredient, double cups) {
        double cupGrams = cups * (conversionFactor);
        long convertGrams = Math.round(cupGrams);
        int grams = Math.toIntExact(convertGrams);
        return grams;
    }
}
