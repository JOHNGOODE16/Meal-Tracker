/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MacroTracker;

/**
 *
 * @author johnathan
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodTest {
    private Food f;
    
    @BeforeEach
    public void setup(){
        f = new Food("Test", 5.5, 22.0, 18.0, 400, 300);
    }
    
    @Test
    public void testCaloriesCalculation() {
        double expectedCalories = (5.5 * 9) + (22 * 4) + (18 * 4);  // 90 + 80 + 120 = 290
        assertEquals(expectedCalories, f.getCalories(), 0.001);// delta (0.001) included because of float comparison
    }
    
    @Test
    public void testNegativeMacrosThrow() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Food("Invalid", -1, 0, 0, 0, 0);
        });
    }
    
    @Test
    public void testGettersReturnCorrectValues() {
        assertEquals(5.5, f.getFat(), 0.001);
        assertEquals(22.0, f.getCarbs(), 0.001);
        assertEquals(18.0, f.getProtein(), 0.001);
        assertEquals(400, f.getPotassium());
        assertEquals(300, f.getSodium());
    }
    
    @Test
    public void testToString(){
        String result = f.toString(); 
        assertTrue(result.contains("Test"));
        assertTrue(result.contains("Fats: 5.5g"));
        assertTrue(result.contains("Carbs: 22.0g"));
        assertTrue(result.contains("Protein: 18.0g"));
        assertTrue(result.contains("Sodium: 300mg"));
        assertTrue(result.contains("Potassium: 400mg"));
    }
}

