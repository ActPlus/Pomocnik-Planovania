/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh.plan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author Ja
 */
public class Plan extends JPanel {
    private Date zaciatok;
    private Date koniec;
    private String nazov;
    private String poznamka; 
    private boolean repeat; //if true repeat
    private float opakujKazdych; //time period in seconds
    
    private Color colorRam;
    
    
    public Plan(){
        nazov = "nazov predmetu";
        colorRam = Color.GRAY.brighter();
    }
    
    public Plan(int x, int y, int width, int height){
        setBounds(x, y, width, height);
        nazov = "nazov predmetu";
        colorRam = Color.GRAY.brighter();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.setColor(Color.BLACK);
        g.drawString(nazov, 0, 10);
        g.setColor(colorRam);
        g.drawRect(2, 2, getWidth()-3, getHeight()-3);
      
        
        validate();
        repaint();
    }
    
    
}
