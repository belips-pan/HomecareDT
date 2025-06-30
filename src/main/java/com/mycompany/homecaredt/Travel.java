/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homecaredt;

/**
 *
 * @author <Panagiotis Beligiannis at HOU>
 */
public class Travel {
private String travelMsg;

    public Travel(String travelMsg) {
        this.travelMsg = travelMsg;
    }

    public String getTravelMsg() {
        return travelMsg;
    }

    public void setTravelMsg(String travelMsg) {
        this.travelMsg = travelMsg;
    }

    @Override
    public String toString() {
        return "Travel{" + "travelMsg=" + travelMsg + '}';
    }
}
