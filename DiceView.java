import javax.swing.*;

/** Klasa DiceView bën afishimin e rezultatit me anë të dritareve grafike */
public class DiceView
{
    int check = 0;
    /** printDiceValue përdorë metodën showMessageDialog  të JOptionPane për të bërë afishimin e rezultatit të fituar */
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