/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import sk.kuznecov.pomocnikplanovania.Updateable;

/**
 *
 * @author Ja
 */
public abstract class Rozvrh extends JPanel implements Updateable {
    
    public Rozvrh(){
        setLayout(null);
        
    }
    
    public Rozvrh(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        setLayout(null);
        
    }
    
    public void drawBorder(Graphics g, Color color,int offset){
        g.setColor(Color.GREEN.brighter().brighter().brighter());
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(color);
        g.drawRect(1+offset, 1+offset, getWidth()-2-2*offset, getHeight()-2-2*offset);
    }
}
