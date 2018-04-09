/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh.plan;

import java.util.ArrayList;
import java.util.Date;
import sk.kuznecov.pomocnikplanovania.ludia.Uzivatel;

/**
 *
 * @author Ja
 */
public class Stretnutie extends Plan{
    private String kde;
    private ArrayList<Uzivatel> sKym;

    public Stretnutie(String kde, ArrayList<Uzivatel> sKym, Date zaciatok, Date koniec, String nazov, String poznamka, boolean repeat, float opakujKazdych) {
        super(zaciatok, koniec, nazov, poznamka, repeat, opakujKazdych);
        this.kde = kde;
        this.sKym = sKym;
    }

    public String getKde() {
        return kde;
    }

    public void setKde(String kde) {
        this.kde = kde;
    }

    public ArrayList<Uzivatel> getsKym() {
        return sKym;
    }

    public void setsKym(ArrayList<Uzivatel> sKym) {
        this.sKym = sKym;
    }
    
    

    
}
