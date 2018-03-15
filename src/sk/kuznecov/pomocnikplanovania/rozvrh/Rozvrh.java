/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh;

import javax.swing.JPanel;
import sk.kuznecov.pomocnikplanovania.Updateable;

/**
 *
 * @author Ja
 */
public abstract class Rozvrh extends JPanel implements Updateable {

    public Rozvrh(int x, int y, int width, int height) {
        super();
        setBounds(x, y, width, height);
    }
}
