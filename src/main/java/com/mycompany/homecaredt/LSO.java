/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homecaredt;

/**
 *
 * @author <Panagiotis Beligiannis at HOU>
 */
public class LSO {
    private String lsoCom;

    public LSO(String lsoCom) {
        this.lsoCom = lsoCom;
    }

    public String getLsoCom() {
        return lsoCom;
    }

    public void setLsoCom(String lsoCom) {
        this.lsoCom = lsoCom;
    }

    @Override
    public String toString() {
        return "LSO{" + "lsoCom=" + lsoCom + '}';
    }
}
