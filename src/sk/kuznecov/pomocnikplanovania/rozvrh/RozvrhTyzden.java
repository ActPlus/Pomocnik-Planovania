/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh;

import java.awt.Graphics;
import java.awt.GridLayout;
import sk.kuznecov.pomocnikplanovania.Updateable;


/**
 *
 * @author Ja
 */
public class RozvrhTyzden extends Rozvrh implements Updateable{
    
    private  RozvrhDen[] dni;

    
    
    private final int pocetDniV_Tyzdni=7;


    public RozvrhTyzden() {
        dni = new RozvrhDen[pocetDniV_Tyzdni];
        //int posunY=bounds.height/pocetDniV_Tyzdni;
        setLayout(new GridLayout(7, 1,0,2));
        for (int i = 0; i < pocetDniV_Tyzdni; i++) {
            dni[i] = new RozvrhDen();
            this.add(dni[i]);
        }
        validate();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        //drawBorder(g, Color.BLACK,0);
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
