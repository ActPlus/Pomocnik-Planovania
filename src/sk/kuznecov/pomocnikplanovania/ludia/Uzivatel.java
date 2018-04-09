/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.ludia;

import java.io.Serializable;
import java.util.ArrayList;
import sk.kuznecov.pomocnikplanovania.skupiny.Skupina;

/**
 *
 * @author Ja
 */
public class Uzivatel implements Serializable{
    
    private ArrayList<Skupina> skupiny;
    
    private String email, meno, heslo;

    public Uzivatel(String email, String meno, String heslo) {
        this.email = email;
        this.meno = meno;
        this.heslo = heslo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getHeslo() {
        return heslo;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    public ArrayList<Skupina> getSkupiny() {
        return skupiny;
    }

    public void setSkupiny(ArrayList<Skupina> skupiny) {
        this.skupiny = skupiny;
    }
    
    public boolean prihlasenie(Uzivatel uzivatel){
        if(getEmail().equals(uzivatel.getEmail()))
            if(getHeslo().equals(uzivatel.getHeslo())) {
                setMeno(uzivatel.getMeno());
                return true;
            }
                
        return false;
    }
    
    
    
    
}
