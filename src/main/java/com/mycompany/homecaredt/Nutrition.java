/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homecaredt;

/**
 *
 * @author <Panagiotis Beligiannis at HOU>
 */
public class Nutrition {
    private Boolean breakfast;
    private Boolean meal;
    private Boolean dinner;
    private Boolean snack;

    public Nutrition(Boolean breakfast, Boolean meal, Boolean dinner, Boolean snack) {
        this.breakfast = breakfast;
        this.meal = meal;
        this.dinner = dinner;
        this.snack = snack;
    }

    public Boolean getBreakfast() {
        return breakfast;
    }

    public Boolean getMeal() {
        return meal;
    }

    public Boolean getDinner() {
        return dinner;
    }

    public Boolean getSnack() {
        return snack;
    }

    public void setBreakfast(Boolean breakfast) {
        this.breakfast = breakfast;
    }

    public void setMeal(Boolean meal) {
        this.meal = meal;
    }

    public void setDinner(Boolean dinner) {
        this.dinner = dinner;
    }

    public void setSnack(Boolean snack) {
        this.snack = snack;
    }

    
    
    public String prepareMessage() {
        String msg = "Nutrition message : Please I would like to take ";
        if (this.breakfast) {
            msg += "breakfast";
        }
        if (this.meal) {
            msg += "meal";
        }
        if (this.dinner) {
            msg += "dinner";
        }
        if (this.snack) {
            msg += "snack";
        }
        return msg;
    }    
}
