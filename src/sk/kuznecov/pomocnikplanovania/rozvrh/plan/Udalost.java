/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh.plan;

import java.util.ArrayList;
import sk.kuznecov.pomocnikplanovania.ludia.Uzivatel;
import sk.kuznecov.pomocnikplanovania.rozvrh.plan.povinne.Cviko;

/**
 *
 * @author Ja
 */
public class Udalost {
    private String kde;
    private ArrayList<Class> ciel;
    private ArrayList<Uzivatel> prihlasenych;
    private int cena;
    private int kapacita;

    public Udalost(String kde, ArrayList<Class> ciel, int cena, ArrayList<Uzivatel> prihlasenych, int kapacita) {
        this.kde = kde;
        this.ciel = ciel;
        this.prihlasenych = prihlasenych;
        this.kapacita = kapacita;
        this.cena = cena;
    }

    public String getKde() {
        return kde;
    }

    public void setKde(String kde) {
        this.kde = kde;
    }

    public ArrayList<Class> getCiel() {
        return ciel;
    }

    public void setCiel(ArrayList<Class> ciel) {
        this.ciel = ciel;
    }

    public ArrayList<Uzivatel> getPrihlasenych() {
        return prihlasenych;
    }

    public void setPrihlasenych(ArrayList<Uzivatel> prihlasenych) {
        this.prihlasenych = prihlasenych;
    }

    public int getKapacita() {
        return kapacita;
    }

    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    
}
