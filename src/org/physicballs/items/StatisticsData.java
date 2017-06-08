/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.physicballs.items;

import java.io.Serializable;

/**
 *
 * @author Toni
 */
public class StatisticsData implements Serializable{
    public float velocitat, velocitatM,acceleracio, acceleracioM, massa, massaM;
    public int nBolles, nPantalla;
    public StatisticsData(int nBolles, float velocitat, float acceleracio, float massa, float velocitatM, float acceleracioM, float massaM) {
        this.nBolles = nBolles;
        this.velocitat = velocitat;
        this.acceleracio = acceleracio;
        this.massa = massa;
        this.velocitatM = velocitatM;
        this.acceleracioM = acceleracioM;
        this.massaM = massaM;
    }

    public StatisticsData() {
    }

    public void setnPantalla(int nPantalla) {
        this.nPantalla = nPantalla;
    }
}
