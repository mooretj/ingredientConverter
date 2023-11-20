package com.Ingredients;

public abstract class Ingredient {

    private double conversionFactor;
    private String name;

    public String getName() {
        return this.name;
    }

    public double getConversionFactor() {
        return this.conversionFactor;
    }

    public void setConversionFactor(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public Ingredient() {}

    public Ingredient(double conversionFactor, String name) {
        this.conversionFactor = conversionFactor;
        this.name = name;
    }

    public int teaspoonsToGrams(Ingredient ingredient, double teaspoons) {
        double tspGrams = teaspoons * (ingredient.getConversionFactor() / 48);
        long convertGrams = Math.round(tspGrams);
        int grams = Math.toIntExact(convertGrams);
        return grams;
    }

    public int tablespoonsToGrams(Ingredient ingredient, double tablespoons) {
        double tbspGrams = tablespoons * (ingredient.getConversionFactor() / 16);
        long convertGrams = Math.round(tbspGrams);
        int grams = Math.toIntExact(convertGrams);
        return grams;
    }

    public int cupsToGrams(Ingredient ingredient, double cups) {
        double cupGrams = cups * (ingredient.getConversionFactor());
        long convertGrams = Math.round(cupGrams);
        int grams = Math.toIntExact(convertGrams);
        return grams;
    }
}
