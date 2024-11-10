package awesome.sauce;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class Dice implements ActionListener
{
    // frame or window
    int diceAmount;
    JFrame diceFrame = new JFrame("Randomizer");
    // button
    JButton diceButton = new JButton("Click me to roll a dice!");
    // image
    ImageIcon diceImageIcon = new ImageIcon("src\\main\\resources\\diceicon.png");
    Scanner input = new Scanner(System.in);

    Dice()
    {
        System.out.println("How many dice would you like to roll? (1-12, the more dices, the more time it'll take to show up) ");
        diceAmount = input.nextInt();
        if(diceAmount <= 0)
        {
            System.out.println("You cannot have negative or zero dices");
            System.exit(0);
        }
        // if having more than 10-12 dices didn't lag the program, then i would've added up to 20
        if(diceAmount > 12)
        {
            System.out.println("You cannot have more than 12 dices at a time (more dices, more instances, more lag).");
            System.exit(0);
        }

        diceButton.setBounds(150, 150, 250, 50);

        diceButton.setFocusable(false);
        diceButton.addActionListener(this);
        diceButton.setBackground(Color.BLACK);
        diceButton.setForeground(Color.WHITE);

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
            if(diceAmount == 1)
            {
                DiceRoll createDiceOne = new DiceRoll();
            }
            if(diceAmount == 2){
                DiceRoll createDiceOne = new DiceRoll();
                DiceRoll createDiceTwo = new DiceRoll();
            }
            if(diceAmount == 3)
            {
                DiceRoll createDiceOne = new DiceRoll();
                DiceRoll createDiceTwo = new DiceRoll();
                DiceRoll createDiceThree = new DiceRoll();
            }
            if(diceAmount == 4)
            {
                DiceRoll createDiceOne = new DiceRoll();
                DiceRoll createDiceTwo = new DiceRoll();
                DiceRoll createDiceThree = new DiceRoll();
                DiceRoll createDiceFour = new DiceRoll();
            }
            if(diceAmount == 5)
            {
                DiceRoll createDiceOne = new DiceRoll();
                DiceRoll createDiceTwo = new DiceRoll();
                DiceRoll createDiceThree = new DiceRoll();
                DiceRoll createDiceFour = new DiceRoll();
                DiceRoll createDiceFive = new DiceRoll();
            }
            if(diceAmount == 6)
            {
                DiceRoll createDiceOne = new DiceRoll();
                DiceRoll createDiceTwo = new DiceRoll();
                DiceRoll createDiceThree = new DiceRoll();
                DiceRoll createDiceFour = new DiceRoll();
                DiceRoll createDiceFive = new DiceRoll();
                DiceRoll createDiceSix = new DiceRoll();
            }
            if(diceAmount == 7)
            {
                DiceRoll createDiceOne = new DiceRoll();
                DiceRoll createDiceTwo = new DiceRoll();
                DiceRoll createDiceThree = new DiceRoll();
                DiceRoll createDiceFour = new DiceRoll();
                DiceRoll createDiceFive = new DiceRoll();
                DiceRoll createDiceSix = new DiceRoll();
                DiceRoll createDiceSeven = new DiceRoll();
            }
            if(diceAmount == 8)
            {
                DiceRoll createDiceOne = new DiceRoll();
                DiceRoll createDiceTwo = new DiceRoll();
                DiceRoll createDiceThree = new DiceRoll();
                DiceRoll createDiceFour = new DiceRoll();
                DiceRoll createDiceFive = new DiceRoll();
                DiceRoll createDiceSix = new DiceRoll();
                DiceRoll createDiceSeven = new DiceRoll();
                DiceRoll createDiceEight = new DiceRoll();
            }
            if(diceAmount == 9)
            {
                DiceRoll createDiceOne = new DiceRoll();
                DiceRoll createDiceTwo = new DiceRoll();
                DiceRoll createDiceThree = new DiceRoll();
                DiceRoll createDiceFour = new DiceRoll();
                DiceRoll createDiceFive = new DiceRoll();
                DiceRoll createDiceSix = new DiceRoll();
                DiceRoll createDiceSeven = new DiceRoll();
                DiceRoll createDiceEight = new DiceRoll();
                DiceRoll createDiceNine = new DiceRoll();
            }
            if(diceAmount == 10)
            {
                DiceRoll createDiceOne = new DiceRoll();
                DiceRoll createDiceTwo = new DiceRoll();
                DiceRoll createDiceThree = new DiceRoll();
                DiceRoll createDiceFour = new DiceRoll();
                DiceRoll createDiceFive = new DiceRoll();
                DiceRoll createDiceSix = new DiceRoll();
                DiceRoll createDiceSeven = new DiceRoll();
                DiceRoll createDiceEight = new DiceRoll();
                DiceRoll createDiceNine = new DiceRoll();
                DiceRoll createDiceTen = new DiceRoll();
            }
            if(diceAmount == 11)
            {
                DiceRoll createDiceOne = new DiceRoll();
                DiceRoll createDiceTwo = new DiceRoll();
                DiceRoll createDiceThree = new DiceRoll();
                DiceRoll createDiceFour = new DiceRoll();
                DiceRoll createDiceFive = new DiceRoll();
                DiceRoll createDiceSix = new DiceRoll();
                DiceRoll createDiceSeven = new DiceRoll();
                DiceRoll createDiceEight = new DiceRoll();
                DiceRoll createDiceNine = new DiceRoll();
                DiceRoll createDiceTen = new DiceRoll();
                DiceRoll createDiceEleven = new DiceRoll();
            }
            if(diceAmount == 12)
            {
                DiceRoll createDiceOne = new DiceRoll();
                DiceRoll createDiceTwo = new DiceRoll();
                DiceRoll createDiceThree = new DiceRoll();
                DiceRoll createDiceFour = new DiceRoll();
                DiceRoll createDiceFive = new DiceRoll();
                DiceRoll createDiceSix = new DiceRoll();
                DiceRoll createDiceSeven = new DiceRoll();
                DiceRoll createDiceEight = new DiceRoll();
                DiceRoll createDiceNine = new DiceRoll();
                DiceRoll createDiceTen = new DiceRoll();
                DiceRoll createDiceEleven = new DiceRoll();
                DiceRoll createDiceTwelve = new DiceRoll();
            }



            System.out.println("Rolling dice(s)...");
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
