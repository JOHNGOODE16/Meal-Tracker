/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MacroTracker;

/**
 *
 * @author johnathan
 */
public class Food {

    private final String name;
    private final double fat;
    private final double carbs;
    private final double protein;
    private final int potassium;
    private final int sodium;

    public Food(String name, double fat, double carbs, double protein, int potassium, int sodium) {
        if (fat < 0 || carbs < 0 || protein < 0 || potassium < 0 || sodium < 0) {
            throw new IllegalArgumentException("Nutritional values cannot be negative");
        }
        this.name = name;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
        this.potassium = potassium;
        this.sodium = sodium;
    }
    public String getName(){
        return name;
    }
    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getProtein() {
        return protein;
    }

    public int getPotassium() {
        return potassium;
    }

    public int getSodium() {
        return sodium;
    }

    public double getCalories() {
        return (fat * 9) + (carbs * 4) + (protein * 4);
    }
    
    @Override
    public String toString(){
        return name + ":" + "\nFats:" + fat + "\nCarbs: " + carbs +  "\nProtein: " + protein + "\nSodium: " + sodium + "\nPotassium: " + potassium;
    }
}
