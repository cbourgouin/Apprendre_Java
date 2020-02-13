/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.test;

import javax.swing.*;
import java.awt.*;

public class TestIHM extends JFrame{
    private JButton b1;
    private JButton b2;

    public static void main(String[] args) {
        
        TestIHM maFenetre = new TestIHM();
        maFenetre.pack();
        maFenetre.setVisible(true);
    }
    
    public TestIHM() {
        super("Notre exemple d'IHM");
        setLayout(new FlowLayout());
        b1 = new JButton("Appuyer");
        b2 = new JButton("ne pas Appuyer");
        b2.setToolTipText("pas touche");
        Container content = getContentPane();
        content.add(b1);
        content.add(b2);
    }
    
}
