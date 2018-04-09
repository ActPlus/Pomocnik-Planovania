/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh;

import java.awt.GridLayout;
import java.util.Calendar;

/**
 *
 * @author Ja
 */
public class RozvrhMesiac extends RozvrhDen{
    
    public RozvrhMesiac(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    
    private int pocetDniV_Mesiaci;
    
    public RozvrhDen[] dni;
    
    public RozvrhMesiac() {
        Calendar c = Calendar.getInstance();
        pocetDniV_Mesiaci = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        dni = new RozvrhDen[pocetDniV_Mesiaci];
        //int posunY=bounds.height/pocetDniV_Tyzdni;
        setLayout(new GridLayout(0, 7,2,2));
        for (int i = 0; i < pocetDniV_Mesiaci; i++) {
            dni[i] = new RozvrhDen();
            this.add(dni[i]);
        }
        validate();
        repaint();
    }
    
}
