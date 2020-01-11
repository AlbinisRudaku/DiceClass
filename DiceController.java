/** Klasa DieClass e bën kontrollimin e hedhjes së zarit me anë të metodave */
public class DiceController
{
    /**
     * private DiceModel model bën deklarimin e klasës DiceModel
     * private DiceView view bën deklarimin e klasës DiceView
     */
    private DiceModel model;
    private DiceView view;

    /** Metoda kontroller DiceController e bën deklarimin e klasës DiceController
     * me DiceModel dhe DiceView */
    public  DiceController(DiceModel model, DiceView view)
    {
        this.model = model;
        this.view = view;
    }

    /** Nëse askForInput  është më i madh se 0,atëherë metoda throwDice() bën hedhjen e zareve
     *  në mënyrë të rëndomt duke përdorur Math.random() dhe bën afishimin i rezultatit të fituar */
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