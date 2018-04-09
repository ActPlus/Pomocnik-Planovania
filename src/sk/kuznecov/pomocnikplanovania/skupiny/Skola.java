/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.skupiny;

import java.util.ArrayList;
import sk.kuznecov.pomocnikplanovania.ludia.Riaditel;
import sk.kuznecov.pomocnikplanovania.ludia.Ucitel;
import sk.kuznecov.pomocnikplanovania.ludia.Uzivatel;
import sk.kuznecov.pomocnikplanovania.ludia.Ziak;

/**
 *
 * @author Ja
 */
public class Skola extends Skupina{
    private String nazov;
    private String ulica;
    private ArrayList<Ucitel> ucitelia;
    private ArrayList<Ziak> ziaci;
    private Riaditel riaditel;
    
    private ArrayList<Miestnost> miestnosti;

    public Skola(String nazov, String ulica, ArrayList<Ucitel> ucitelia, ArrayList<Ziak> ziaci, Riaditel riaditel, ArrayList<Miestnost> miestnosti, int id) {
        super(id, vytvorPoleUzivatelov(ucitelia, ziaci, riaditel));
        this.nazov = nazov;
        this.ulica = ulica;
        this.ucitelia = ucitelia;
        this.ziaci = ziaci;
        this.riaditel = riaditel;
        this.miestnosti = miestnosti;
    }
    
    private static ArrayList<Uzivatel> vytvorPoleUzivatelov(ArrayList<Ucitel> ucitelia,ArrayList<Ziak> ziaci,Riaditel riaditel){
        ArrayList<Uzivatel> clenovia = new ArrayList<Uzivatel>();
        clenovia.addAll(ziaci);
        clenovia.addAll(ucitelia);
        clenovia.add(riaditel);
        return clenovia;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public ArrayList<Ucitel> getUcitelia() {
        return ucitelia;
    }

    public void setUcitelia(ArrayList<Ucitel> ucitelia) {
        this.ucitelia = ucitelia;
    }

    public ArrayList<Ziak> getZiaci() {
        return ziaci;
    }

    public void setZiaci(ArrayList<Ziak> ziaci) {
        this.ziaci = ziaci;
    }

    public Riaditel getRiaditel() {
        return riaditel;
    }

    public void setRiaditel(Riaditel riaditel) {
        this.riaditel = riaditel;
    }

    public ArrayList<Miestnost> getMiestnosti() {
        return miestnosti;
    }

    public void setMiestnosti(ArrayList<Miestnost> miestnosti) {
        this.miestnosti = miestnosti;
    }
    
    
    
    
    
}
