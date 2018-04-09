/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.rozvrh.plan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import org.jcp.xml.dsig.internal.dom.Utils;

/**
 *
 * @author Ja
 */
public class Plan {

    private Date zaciatok;
    private Date koniec;
    private String nazov;
    private String poznamka;
    private boolean repeat; //if true repeat
    private float opakujKazdych; //time period in seconds

    private Color colorRam = Color.GRAY.brighter();
    protected String kategoria = "Plan";

    public Plan(Date zaciatok, Date koniec, String nazov, String poznamka, boolean repeat, float opakujKazdych) {
        this.zaciatok = zaciatok;
        this.koniec = koniec;
        this.nazov = nazov;
        this.poznamka = poznamka;
        this.repeat = repeat;
        this.opakujKazdych = opakujKazdych;
    }
    
    public void uprav(Date zaciatok, Date koniec, String nazov, String poznamka, boolean repeat, float opakujKazdych) {
        this.zaciatok = zaciatok;
        this.koniec = koniec;
        this.nazov = nazov;
        this.poznamka = poznamka;
        this.repeat = repeat;
        this.opakujKazdych = opakujKazdych;
    }

    public JPanel getJPanel() {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(colorRam);
                g.drawRect(0, 0, getWidth(), getHeight());

                repaint();
            }
        };

        JLabel zaciatokLbl, koniecLbl, nazovLbl;
        JTextArea poznamkaLbl;
        SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm");
        String timeZaciatok = localDateFormat.format(zaciatok);
        String timeKoniec = localDateFormat.format(koniec);

        zaciatokLbl = new JLabel("Od: " + timeZaciatok);
        koniecLbl = new JLabel("Do: " + timeKoniec);

        nazovLbl = new JLabel(nazov.substring(0, Math.min(nazov.length(), 15)) + "..");
        poznamkaLbl = new JTextArea(poznamka);

        poznamkaLbl.setEditable(false);
        poznamkaLbl.setWrapStyleWord(true);
        poznamkaLbl.setLineWrap(true);

        JPanel dialogPanelMax = new JPanel();
        JPanel centerPanelMin = new JPanel();
        JPanel centerPanelMax = new JPanel();
        JPanel buttonPanel = new JPanel();

        JButton upravBtn = new JButton("Uprav");
        upravBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //TODO: uprav plan on cilck dialog
            }
        });

        panel.setLayout(new BorderLayout());
        dialogPanelMax.setLayout(new BorderLayout());

        GridLayout grid2collLay = new GridLayout(2, 1);
        GridLayout grid1collLay = new GridLayout(0, 1);

        centerPanelMin.setLayout(grid2collLay);
        centerPanelMin.add(zaciatokLbl);
        centerPanelMin.add(koniecLbl);

        centerPanelMax.setLayout(grid1collLay);
        centerPanelMax.add(centerPanelMin);
        centerPanelMax.add(poznamkaLbl);

        buttonPanel.add(upravBtn);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                JOptionPane jop = new JOptionPane();
                JDialog dialog = jop.createDialog(kategoria);
                dialog.setContentPane(dialogPanelMax);
                dialog.pack();
                dialog.setVisible(true);
            }
        });

        panel.add(nazovLbl, BorderLayout.NORTH);
        panel.add(centerPanelMin, BorderLayout.CENTER);

        dialogPanelMax.add(new JLabel("Nazov: " + nazov), BorderLayout.NORTH);
        dialogPanelMax.add(centerPanelMax, BorderLayout.CENTER);
        dialogPanelMax.add(buttonPanel, BorderLayout.SOUTH);
        return panel;
    }
    
    public Date getZaciatok() {
        return zaciatok;
    }

    public void setZaciatok(Date zaciatok) {
        this.zaciatok = zaciatok;
    }

    public Date getKoniec() {
        return koniec;
    }

    public void setKoniec(Date koniec) {
        this.koniec = koniec;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getPoznamka() {
        return poznamka;
    }

    public void setPoznamka(String poznamka) {
        this.poznamka = poznamka;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public float getOpakujKazdych() {
        return opakujKazdych;
    }

    public void setOpakujKazdych(float opakujKazdych) {
        this.opakujKazdych = opakujKazdych;
    }

    public Color getColorRam() {
        return colorRam;
    }

    public void setColorRam(Color colorRam) {
        this.colorRam = colorRam;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    
    
}
