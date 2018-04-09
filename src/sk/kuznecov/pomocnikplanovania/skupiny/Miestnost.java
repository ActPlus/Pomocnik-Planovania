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
public class Miestnost extends Skupina{
    private String cislo;
    private String popis;
    private int kapacita;
    
    public Miestnost(int id, String cislo, String popis, ArrayList<Uzivatel> clenovia) {
        super(id, clenovia);
        this.cislo = cislo;
        this.popis = popis;
    }
    
    public boolean pridajCloveka(Uzivatel clen){
        
        if(!volneMiesto()){
            return false;
        }
        getClenovia().add(clen);
        return true;
    }
    
    private boolean volneMiesto(){
        return kapacita<getClenovia().size();
    }

    public String getCislo() {
        return cislo;
    }

    public void setCislo(String cislo) {
        this.cislo = cislo;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public int getKapacita() {
        return kapacita;
    }

    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }
}
