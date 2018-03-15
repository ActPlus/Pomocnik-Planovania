/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh;

import java.awt.Graphics;
import java.sql.Time;

/**
 *
 * @author Ja
 */
public class RozvrhTyzden extends Rozvrh{
    
    private  RozvrhDen[] dni;

    
    
    private final int pocetDniV_Tyzdni=7;

    public RozvrhTyzden(int x, int y, int width, int height) {
        super(x, y, width, height);
        dni = new RozvrhDen[pocetDniV_Tyzdni];
        
        
        int posunY=height/pocetDniV_Tyzdni;
        
        for (int i = 0; i < dni.length; i++) {
            dni[i] = new RozvrhDen(x, y+posunY*i, width, height/pocetDniV_Tyzdni);
        }
    }

  

    @Override
    public void update() {
        for (RozvrhDen den : dni) {
            den.update();
        }
    }
    
    public void resize(int x, int y, int width, int height){
        move(x, y);
        resize(width, height);
    }
    
    public RozvrhDen[] getDni() {
        return dni;
    }

    public void setDni(RozvrhDen[] dni) {
        this.dni = dni;
    }
    
}
