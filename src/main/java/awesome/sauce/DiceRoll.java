package awesome.sauce;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

public class DiceRoll
{

    String dice = "";
    // frame
    JFrame diceRollFrame = new JFrame("Randomizer Result");
    // image
    ImageIcon diceRollImage = new ImageIcon("src\\main\\resources\\diceicon.png");

    DiceRoll()
    {
        int randomX = (int) (Math.random() * 1000) + 500;
        int randomY = (int) (Math.random() * 500) + 100;
        int diceRollRandom = (int) (Math.random() * 6) + 1;

        diceRollFrame.setIconImage(diceRollImage.getImage());
        diceRollFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        diceRollFrame.setVisible(true);
        diceRollFrame.setResizable(false);
        diceRollFrame.setLayout(null);
        diceRollFrame.setSize(318, 340);

        if(diceRollRandom == 1)
        {
            dice = "src\\main\\resources\\diceroll1.png";
            playSound("boo.wav");
        }
        if(diceRollRandom == 2)
        {
            dice = "src\\main\\resources\\diceroll2.png";
        }
        if(diceRollRandom == 3)
        {
            dice = "src\\main\\resources\\diceroll3.png";
        }
        if(diceRollRandom == 4)
        {
            dice = "src\\main\\resources\\diceroll4.png";
        }
        if(diceRollRandom == 5)
        {
            dice = "src\\main\\resources\\diceroll5.png";
        }
        if(diceRollRandom == 6)
        {
            dice = "src\\main\\resources\\diceroll6.png";
            playSound("hooray.wav");
        }

        ImageIcon diceRollResultImage = new ImageIcon(dice);
        JLabel diceRollDisplay = new JLabel(diceRollResultImage);

        diceRollDisplay.setSize(300, 300);

        diceRollFrame.add(diceRollDisplay);

        diceRollFrame.setLocation(randomX, randomY);
    }

    public void playSound(String soundName)
    {
        try
        {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File("src\\main\\resources\\" + soundName));
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
            audioClip.start();
        }
        catch(Exception err)
        {
            System.out.println("Couldn't play the audio...");
            err.printStackTrace();
        }
    }


}
