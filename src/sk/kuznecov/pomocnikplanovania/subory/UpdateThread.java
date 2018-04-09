/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.subory;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sk.kuznecov.pomocnikplanovania.rozvrh.plan.Plan;

/**
 *
 * @author Ja
 */
public class UpdateThread extends Thread {

    private static int sss = 0;
    private boolean running = false;

    public static String getSSS() {
        return String.valueOf(sss);
    }

    private ArrayList<Plan> plany;
    private ArrayList<Plan> novePlany;

    public UpdateThread(String name) {
        super(name);
        plany = new ArrayList();
    }

    @Override
    public void run() {
        while (running) {
            try {
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(UpdateThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            sss++;
        }
    }

    @Override
    public synchronized void start() {
        super.start();
        running = true;
    }

    public boolean foundUpdate() {
        return !novePlany.isEmpty();
    }

    public ArrayList<Plan> getPlany() {
        plany.addAll(novePlany);
        ArrayList<Plan> docasnePlany = novePlany;
        novePlany.clear();
        return docasnePlany;
    }
}
