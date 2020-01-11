/** This is the model class which generates a random number from one to six */
public class DiceModel
{
    /** The throwDice() method generates a random number using Math.random() */
    public int throwDice()
    {       
        return (int)((Math.random() * 6) + 1);
    }
}
