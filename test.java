/*
Playing with recursion
*/
package jcolours;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JColours extends JFrame {

    public static void main(String[] args) {
        
        JColours jCol = new JColours();
        jCol.setVisible(true);
        jCol.setSize(new Dimension(640, 480));
        jCol.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel jCont = new JPanel();
        jCol.add(jCont);
        
        JLabel test;
        
        int step = 16;
        
        
        //Render loop
        for (int i=0; i<256; i+=step) {
            for (int j=0; j<256; j+=step) {
                for (int k=0; k<256; k+=step) {
                    test = new JLabel("$");
                    jCont.add(test);
                    test.setForeground(new Color(i, j, k));
                    jCol.repaint();
                    jCol.revalidate();
                }
            }
        }

        //End of cycle
        System.out.println("Cycle");
        return;
    }
}
