/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import sk.kuznecov.pomocnikplanovania.Updateable;
import sk.kuznecov.pomocnikplanovania.rozvrh.plan.Plan;

/**
 *
 * @author Ja
 */
public class RozvrhDen extends JPanel implements Updateable{
    
    private ArrayList<Plan> plany;

    public RozvrhDen(int x, int y, int width, int height) {
        plany = new ArrayList();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public void update() {

    }
    
}