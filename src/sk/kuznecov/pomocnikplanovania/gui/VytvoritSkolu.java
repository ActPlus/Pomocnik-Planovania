/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania.gui;

/**
 *
 * @author Ja
 */
public class VytvoritSkolu extends javax.swing.JPanel {

    /**
     * Creates new form VytvoritSkolu
     */
    public VytvoritSkolu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pridavaniePnl2 = new javax.swing.JPanel();
        ludiaPnl2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        pridavaniePredmetovPnl = new javax.swing.JPanel();
        predmetyPnl = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jPanel13 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        pridavanieMiestnostiPnl = new javax.swing.JPanel();
        miestnostiPnl = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jPanel15 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        pridavaniePnl5 = new javax.swing.JPanel();
        ludiaPnl5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList<>();
        jPanel17 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        pridavaniePnl6 = new javax.swing.JPanel();
        ludiaPnl6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList<>();
        jPanel19 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        pridavaniePnl2.setLayout(new java.awt.GridLayout(0, 1));

        ludiaPnl2.setLayout(new java.awt.BorderLayout());

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        ludiaPnl2.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel12.setLayout(new java.awt.GridLayout(0, 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Ludia");
        jPanel12.add(jLabel7);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel11);

        jButton3.setText("Pridat");
        jPanel12.add(jButton3);

        jButton4.setText("Odobrat");
        jPanel12.add(jButton4);

        ludiaPnl2.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        pridavaniePnl2.add(ludiaPnl2);

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridLayout(0, 2));

        jLabel1.setText("Nazov");
        jPanel1.add(jLabel1);
        jPanel1.add(jTextField1);

        jLabel2.setText("Adresa / Ulica");
        jPanel1.add(jLabel2);
        jPanel1.add(jTextField2);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jToolBar1.setRollover(true);

        pridavaniePredmetovPnl.setLayout(new java.awt.GridLayout(0, 1));

        predmetyPnl.setLayout(new java.awt.BorderLayout());

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        predmetyPnl.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jPanel13.setLayout(new java.awt.GridLayout(0, 2));

        jButton5.setText("Pridat");
        jPanel13.add(jButton5);

        jButton6.setText("Odobrat");
        jPanel13.add(jButton6);

        predmetyPnl.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        pridavaniePredmetovPnl.add(predmetyPnl);

        jToolBar1.add(pridavaniePredmetovPnl);

        jTabbedPane1.addTab("Predmety", jToolBar1);

        jToolBar2.setRollover(true);

        pridavanieMiestnostiPnl.setLayout(new java.awt.GridLayout(0, 1));

        miestnostiPnl.setLayout(new java.awt.BorderLayout());

        jList6.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList6);

        miestnostiPnl.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jPanel15.setLayout(new java.awt.GridLayout(0, 2));

        jButton7.setText("Pridat");
        jPanel15.add(jButton7);

        jButton8.setText("Odobrat");
        jPanel15.add(jButton8);

        miestnostiPnl.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        pridavanieMiestnostiPnl.add(miestnostiPnl);

        jToolBar2.add(pridavanieMiestnostiPnl);

        jTabbedPane1.addTab("Miestnosti", jToolBar2);

        jToolBar3.setRollover(true);

        pridavaniePnl5.setLayout(new java.awt.GridLayout(0, 1));

        ludiaPnl5.setLayout(new java.awt.BorderLayout());

        jList7.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(jList7);

        ludiaPnl5.add(jScrollPane7, java.awt.BorderLayout.CENTER);

        jPanel17.setLayout(new java.awt.GridLayout(0, 2));

        jButton9.setText("Pridat");
        jPanel17.add(jButton9);

        jButton10.setText("Odobrat");
        jPanel17.add(jButton10);

        ludiaPnl5.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        pridavaniePnl5.add(ludiaPnl5);

        jToolBar3.add(pridavaniePnl5);

        jTabbedPane1.addTab("Skupiny Ludi", jToolBar3);

        jToolBar4.setRollover(true);

        pridavaniePnl6.setLayout(new java.awt.GridLayout(0, 1));

        ludiaPnl6.setLayout(new java.awt.BorderLayout());

        jList8.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(jList8);

        ludiaPnl6.add(jScrollPane8, java.awt.BorderLayout.CENTER);

        jPanel19.setLayout(new java.awt.GridLayout(0, 2));

        jButton11.setText("Pridat");
        jPanel19.add(jButton11);

        jButton12.setText("Odobrat");
        jPanel19.add(jButton12);

        ludiaPnl6.add(jPanel19, java.awt.BorderLayout.PAGE_START);

        pridavaniePnl6.add(ludiaPnl6);

        jToolBar4.add(pridavaniePnl6);

        jTabbedPane1.addTab("Ludia", jToolBar4);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("Zrusit");
        jPanel3.add(jButton1);

        jButton2.setText("Potvrdit");
        jPanel3.add(jButton2);

        jPanel2.add(jPanel3, java.awt.BorderLayout.EAST);

        add(jPanel2, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JList<String> jList7;
    private javax.swing.JList<String> jList8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JPanel ludiaPnl2;
    private javax.swing.JPanel ludiaPnl5;
    private javax.swing.JPanel ludiaPnl6;
    private javax.swing.JPanel miestnostiPnl;
    private javax.swing.JPanel predmetyPnl;
    private javax.swing.JPanel pridavanieMiestnostiPnl;
    private javax.swing.JPanel pridavaniePnl2;
    private javax.swing.JPanel pridavaniePnl5;
    private javax.swing.JPanel pridavaniePnl6;
    private javax.swing.JPanel pridavaniePredmetovPnl;
    // End of variables declaration//GEN-END:variables
}
