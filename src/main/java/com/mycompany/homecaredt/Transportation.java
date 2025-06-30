/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homecaredt;

/**
 *
 * @author <Panagiotis Beligiannis at HOU>
 */
public class Transportation {
    private String transportMsg;

    public Transportation(String transportMsg) {
        this.transportMsg = transportMsg;
    }

    public String getTransportMsg() {
        return transportMsg;
    }

    public void setTransportMsg(String transportMsg) {
        this.transportMsg = transportMsg;
    }

    @Override
    public String toString() {
        return "Transportation{" + "transportMsg=" + transportMsg + '}';
    }
}
