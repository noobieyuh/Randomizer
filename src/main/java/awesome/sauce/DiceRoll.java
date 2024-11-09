package awesome.sauce;

import javax.swing.*;

public class DiceRoll
{
    // frame
    JFrame diceRollFrame = new JFrame("Randomizer Result");
    // image
    ImageIcon diceRollImage = new ImageIcon("src\\main\\resources\\diceicon.png");
    // label
    JLabel diceRollText = new JLabel("Here is what you rolled: ");
    JLabel diceRollDisplay = new JLabel();

    DiceRoll()
    {
        int randomX = (int) (Math.random() * 1000) + 100;
        int randomY = (int) (Math.random() * 500) + 100;

        diceRollFrame.setIconImage(diceRollImage.getImage());
        diceRollFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        diceRollFrame.setVisible(true);
        diceRollFrame.setResizable(false);
        diceRollFrame.setLayout(null);
        diceRollFrame.setSize(400, 400);

        diceRollFrame.setLocation(randomX, randomY);
    }


}
