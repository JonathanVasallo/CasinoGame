/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vasallofinalproject;

import javax.swing.JFrame;

/**
 *
 * @author Jonathan
 */
public class VasalloFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUIDemo guiDemo = new GUIDemo();
// What to do when the window closes :
        guiDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Size of the window , in pixels
        guiDemo.setSize(720, 480);
// Make the window " visible "
        guiDemo.setVisible(true);
    }
    
}
