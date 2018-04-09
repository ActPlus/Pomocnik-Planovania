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
public class Konicek extends Skupina{
    private String nazoov;
    
    public Konicek(int id, ArrayList<Uzivatel> clenovia,String tema) {
        super(id, clenovia);
        this.nazoov = tema;
    }

    public String getNazov() {
        return nazoov;
    }

    public void setTema(String tema) {
        this.nazoov = tema;
    }
    
}
