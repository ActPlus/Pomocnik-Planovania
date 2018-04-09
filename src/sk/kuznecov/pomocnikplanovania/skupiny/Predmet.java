/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.skupiny;

import sk.kuznecov.pomocnikplanovania.ludia.Ucitel;

/**
 *
 * @author Ja
 */
public class Predmet{
    
    private boolean generovatAutomaticky;
    private String nazov;
    private String popis;

    public Predmet(boolean generovatAutomaticky, String nazov, String popis) {
        this.generovatAutomaticky = generovatAutomaticky;
        this.nazov = nazov;
        this.popis = popis;
    }

    public boolean isGenerovatAutomaticky() {
        return generovatAutomaticky;
    }

    public void setGenerovatAutomaticky(boolean generovatAutomaticky) {
        this.generovatAutomaticky = generovatAutomaticky;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }
    
    
    
}
