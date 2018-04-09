/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh.plan.povinne;

import java.util.Date;
import sk.kuznecov.pomocnikplanovania.skupiny.Predmet;
import sk.kuznecov.pomocnikplanovania.rozvrh.plan.Prednaska;

/**
 *
 * @author Ja
 */
public class Cviko extends Prednaska implements Povinne{

    public Cviko(Predmet predmet, Date zaciatok, Date koniec, String nazov, String poznamka, boolean repeat, float opakujKazdych) {
        super(predmet, zaciatok, koniec, nazov, poznamka, repeat, opakujKazdych);
    }
    
    
}
