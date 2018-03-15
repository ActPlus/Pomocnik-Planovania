/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania;

import java.util.Calendar;

/**
 *
 * @author Ja
 */
public class Main {

    
    public static void main(String[] args) {
        Window frame = new Window();
        frame.setVisible(true);
        System.out.println(Calendar.getInstance().getTime());
    }
    
}
