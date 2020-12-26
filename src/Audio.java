
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jonathan
 */
public class Audio {

    public void playMusic(String musicLocation) {
        try {
            File musicPath = new File(musicLocation);
            if (musicPath.exists()) { // does exist
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                //JOptionPane.showMessageDialog(null, "OK to stop music");
            } else {
                System.out.println("Cant Find File");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "OK");
        }
    }
}
