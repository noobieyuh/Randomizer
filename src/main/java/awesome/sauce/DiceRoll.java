package awesome.sauce;

import javax.swing.*;

public class DiceRoll
{

    String dice = "";
    // frame
    JFrame diceRollFrame = new JFrame("Randomizer Result");
    // image
    ImageIcon diceRollImage = new ImageIcon("src\\main\\resources\\diceicon.png");

    DiceRoll()
    {
        int randomX = (int) (Math.random() * 1000) + 100;
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
        }

        ImageIcon diceRollResultImage = new ImageIcon(dice);
        JLabel diceRollDisplay = new JLabel(diceRollResultImage);

        diceRollDisplay.setSize(300, 300);

        diceRollFrame.add(diceRollDisplay);

        diceRollFrame.setLocation(randomX, randomY);


    }


}
