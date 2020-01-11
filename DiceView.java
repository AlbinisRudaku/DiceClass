/** We needto import this package in order for us to use JOptionPane class */
import javax.swing.*;

/** This class displays the result through a JOptionPane dialog window */
public class DiceView
{
    int check = 0;
    /** PrintDiceValues is a method which uses the other method called showMessageDialog, to give as an output the calculated result */
    public void printDiceValues(int firstValue, int secondValue)
    {
        JOptionPane.showMessageDialog(null, "Dice One: " + firstValue + ", Dice Two: " + secondValue);
    }
    public int askForInput()
    {
        check = JOptionPane.showConfirmDialog(null, "Do you want to roll the dices?", "Confirm your action", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        return check;
    }

}
