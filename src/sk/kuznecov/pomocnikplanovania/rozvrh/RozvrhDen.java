/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import sk.kuznecov.pomocnikplanovania.Updateable;
import sk.kuznecov.pomocnikplanovania.rozvrh.plan.Plan;

/**
 *
 * @author Ja
 */
public class RozvrhDen extends Rozvrh implements Updateable{
    
    private ArrayList<Plan> plany;
    public JScrollPane contentPane;

    public RozvrhDen() {
        contentPane = new JScrollPane();
        //contentPane.setBackground(Color.GREEN.brighter());
        contentPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        contentPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
     
        setLayout(new GridLayout(1, 1));
        add(contentPane);
        revalidate();
        repaint();
        
    }
    
    public RozvrhDen(int x, int y, int width, int height) {
        //super(x, y, width, height);
    }

    

    @Override
    public void paintComponent(Graphics g) {
        drawBorder(g, Color.BLACK.brighter(),0);
        //drawBorder(g, Color.BLACK.brighter(),5);
    }

    public JScrollPane getContentPane() {
        return contentPane;
    }

    public void setContentPane(JScrollPane contentPane) {
        this.contentPane = contentPane;
    }
    

    @Override
    public void update() {

    }
    
}
