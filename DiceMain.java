/** Klasa DieClass përdoret për të bërë egzekutimin e programit */
public class DiceMain
{
    /** Metoda main bënë egzekutimin programit duke i instancuar klasët e tjera */
    public static void main(String[] args)
    {
        DiceView diceView = new DiceView();
        DiceModel diceModel = new DiceModel();
        DiceController diceController = new DiceController(diceModel, diceView);

        diceController.throwDice();
    }
}
