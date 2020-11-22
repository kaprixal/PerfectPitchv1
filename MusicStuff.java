package musicHackathonProject;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicStuff {
    
    void playMusic(String musicLocation)
    {

            try 
            {
                File musicPath = new File(musicLocation); 
                
                if (musicPath.exists()) 
                {
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();
                    //clip.loop(clip.);
                    //clip.wait(5000);
                    //clip.stop();
                    
                    //JOptionPane.showMessageDialog(null, "Hit OK to play the note again");
                    //long clipTimePosition = clip.getMicrosecondPosition();
                    //clip.start();
                    
                    //JOptionPane.showMessageDialog(null, "Hit OK to resume");
                    //clip.setMicrosecondPosition(clipTimePosition);
                    //clip.start();
                    
                    //JOptionPane.showMessageDialog(null, "Press OK to stop playing");
                    //clip.stop();
                }
                else {
                    System.out.println("Can't find file.");
                }
            }
            catch (Exception ex) 
            {
                ex.printStackTrace();
            }
    }

    /*public static void main(String[] args) {
        String path = "C:/Users/Joao Pedro/Downloads/looperman-l-3988681-0232175-lenoxbeatmaker-reaching-inside.wav";
        
    }*/
}