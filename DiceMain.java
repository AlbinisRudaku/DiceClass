/** This class is used to run the written code on the three other classes */
public class DiceMain
{
    /** The main method executes the program while instancing the other related classes */
    public static void main(String[] args)
    {
        DiceView diceView = new DiceView();
        DiceModel diceModel = new DiceModel();
        DiceController diceController = new DiceController(diceModel, diceView);

        diceController.throwDice();
    }
}
