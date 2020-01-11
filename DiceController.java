/** This class controls the process of throwing the dices through its methods */
public class DiceController
{
    /** private DiceModel model declares the DiceModel class
     *  private DiceView view declares the DiceView class */
    private DiceModel model;
    private DiceView view;

    /** The DiceController controller initializes variables such as view and model */
    public  DiceController(DiceModel model, DiceView view)
    {
        this.model = model;
        this.view = view;
    }

    /** If the method askForInput is 0, then method throwDice() generates the number as shown before,
     *  and displays it as the final result */
    public void throwDice()
    {
        int dice1 = model.throwDice();
        int dice2 = model.throwDice();

        if(view.askForInput() == 0)
        {
            view.printDiceValues(dice1, dice2);
        }
    }
}
