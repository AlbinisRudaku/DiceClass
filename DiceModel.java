/** Klasa DieClass bën hedhjen e zarit në mënyrë të rëndomtë */
public class DiceModel
{
    /** Metoda throwDice() hedh zarin në mënyrë të rëndomt
     *  duke përdorur Math.random() */
    public int throwDice()
    {
        return (int)((Math.random() * 6) + 1);
    }
}
