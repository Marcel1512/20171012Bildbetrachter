package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Fenster extends JFrame {

    private JPanel jpWest, jpSouth, jpCenter;
    private JButton jbtnVorher, jbtnNachher;
    private JRadioButton[] jradios;
    private JLabel jLabel;
    private Icon[] icon;
    private ButtonGroup bg;



    public Fenster() {
        super("Bildbetrachter");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.initComponents();
        this.setSize(400, 400);
        this.initEvents();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });

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
            bg.add(jradios[i]);
        }


        jpCenter = new JPanel();
        icon = new ImageIcon[4];
        for (int i = 1; i < 4 ; i++) {
            icon[i] = new ImageIcon("D:\\bilder\\Bild" + i);
        }



        this.add(jpSouth, BorderLayout.SOUTH);
        this.add(jpWest, BorderLayout.WEST);
        this.add(jpCenter, BorderLayout.CENTER);




    }

    private void exit() {
        int temp = JOptionPane.showConfirmDialog(null, "Möchten Sie das Programm jetzt beenden?", "Beenden Bestätigen", JOptionPane.YES_NO_CANCEL_OPTION);

        switch (temp) {
            case JOptionPane.YES_OPTION:
                System.exit(0);
        }


    }

}
