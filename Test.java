
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{


    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
    }

    /**
     * Imprime por pantalla todos los multiplos de 5 entre 10 y 95, no incluidos.
     */
    public void multiplesOfFive()
    {
        int number = 5;
        int index = 0;
        while ((number*index)< 95)
        {
            if (number * index > 10)
            {
                System.out.println (number + " * " + index + " = " + (number*index));
            }
            index++;
        }
    }
}
