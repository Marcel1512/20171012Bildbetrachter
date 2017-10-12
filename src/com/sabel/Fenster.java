package com.sabel;

import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame {

    private JPanel jpWest, jpSouth, jpCenter;
    private JButton jbtnVorher, jbtnNachher;
    private JRadioButton[] jradios;
    private JLabel jLabel;
    private Icon icon;



    public Fenster() {
        super("Bildbetrachter");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.initComponents();
        this.setSize(400, 400);
        this.initEvents();
        this.setVisible(true);

    }

    private void initEvents() {
    }

    private void initComponents() {
        jpSouth = new JPanel();
        jpWest = new JPanel();
        jpWest.setLayout(new BoxLayout(jpWest, BoxLayout.Y_AXIS));
        jbtnVorher = new JButton("Vorheriges Bild");
        jbtnNachher = new JButton("Nächstes Bild");
        jpSouth.add(jbtnVorher);
        jpSouth.add(jbtnNachher);


        jradios = new JRadioButton[4];
        for (int i = 0; i < 4; i++) {
            jradios[i] = new JRadioButton("Bild" + (i + 1));
            jpWest.add(jradios[i]);
        }


        this.add(jpSouth, BorderLayout.SOUTH);
        this.add(jpWest, BorderLayout.WEST);



    }

}
