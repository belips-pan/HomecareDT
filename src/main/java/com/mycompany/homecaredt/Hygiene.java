/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homecaredt;

/**
 *
 * @author <Panagiotis Beligiannis at HOU>
 */
public class Hygiene {
    private Boolean wash;
    private Boolean bath;
    private Boolean toilet;

    public Hygiene(Boolean wash, Boolean bath, Boolean toilet) {
        this.wash = wash;
        this.bath = bath;
        this.toilet = toilet;
    }

    public Boolean getWash() {
        return wash;
    }

    public Boolean getBath() {
        return bath;
    }

    public Boolean getToilet() {
        return toilet;
    }

    public void setWash(Boolean wash) {
        this.wash = wash;
    }

    public void setBath(Boolean bath) {
        this.bath = bath;
    }

    public void setToilet(Boolean toilet) {
        this.toilet = toilet;
    }

    public String SendMessage() {
        String msg = "Hygiene message : Please I want help on ";
        if (this.wash) {
            msg += "washing";
        }
        if (this.bath) {
            msg += "to take a bath";
        }
        if (this.toilet) {
            msg += "to go to toilet";
        }
        return "Hygiene{" + "wash=" + wash + ", bath=" + bath + ", toilet=" + toilet + '}';
    }

}
