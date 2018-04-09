/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.skupiny;

import java.util.ArrayList;
import sk.kuznecov.pomocnikplanovania.ludia.Uzivatel;
/**
 *
 * @author Ja
 */
public class Skupina{
    private int id;
    private ArrayList<Uzivatel> clenovia;

    public Skupina(int id, ArrayList<Uzivatel> clenovia) {
        this.id = id;
        this.clenovia = clenovia;
    }
    
    

    public ArrayList<Uzivatel> getClenovia() {
        return clenovia;
    }

    public void setClenovia(ArrayList<Uzivatel> clenovia) {
        this.clenovia = clenovia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
