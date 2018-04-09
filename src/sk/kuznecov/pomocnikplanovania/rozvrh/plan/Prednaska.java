/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh.plan;

import sk.kuznecov.pomocnikplanovania.skupiny.Predmet;
import java.util.ArrayList;
import java.util.Date;
import sk.kuznecov.pomocnikplanovania.ludia.Ucitel;
import sk.kuznecov.pomocnikplanovania.ludia.Ziak;
import sk.kuznecov.pomocnikplanovania.skupiny.Miestnost;

/**
 *
 * @author Ja
 */
public class Prednaska extends Plan{
    private Predmet predmet;
    private Ucitel ucitel;
    private ArrayList<Ziak> ziaci;
    private Miestnost miestnost;

    public Prednaska(Predmet predmet, Date zaciatok, Date koniec, String nazov, String poznamka, boolean repeat, float opakujKazdych) {
        super(zaciatok, koniec, nazov, poznamka, repeat, opakujKazdych);
        this.predmet = predmet;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }
}
