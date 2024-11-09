package awesome.sauce;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Dice implements ActionListener
{
    // frame or window
    JFrame diceFrame = new JFrame("Randomizer");
    // labels
    JLabel diceLabel = new JLabel("Thanks for trying Randomizer!");
    // button
    JButton diceButton = new JButton("Click me to roll a dice!");
    // image
    ImageIcon diceImageIcon = new ImageIcon("src\\main\\resources\\diceicon.png");

    Dice()
    {
        diceLabel.setBounds(100, 0, 200, 100);

        diceButton.setBounds(250, 250, 100, 100);
        diceButton.addActionListener(this);
        diceButton.setBackground(Color.CYAN);
        diceButton.setFocusable(false);


        diceFrame.add(diceLabel);
        diceFrame.add(diceButton);

        diceFrame.setSize(500,500);
        diceFrame.setVisible(true);
        diceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        diceFrame.setResizable(false);
        diceFrame.setLayout(null);
        diceFrame.setAlwaysOnTop(true);
        diceFrame.setIconImage(diceImageIcon.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == diceButton) {
            playAudio("dicerollshort.wav");
            DiceRoll createDice = new DiceRoll();
        }
    }

    // custom music function
    public void playAudio(String audioSound)
    {
        try
        {
            AudioInputStream aStream = AudioSystem.getAudioInputStream(new File("src\\main\\resources\\" + audioSound));
            Clip soundClip = AudioSystem.getClip();
            soundClip.open(aStream);
            soundClip.start();
        }
        catch(Exception error)
        {
            System.out.println("Can't play the diceroll audio...");
            error.printStackTrace();
        }
    }

}