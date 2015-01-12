
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
        // Mientras el resultado sea menor que 95, se ejecuta el bucle
        while ((number*index)< 95)
        {
            // Solo se imprime si el resultado es mayor que 10
            if (number * index > 10)
            {
                System.out.println (number + " * " + index + " = " + (number*index));
            }
            index++;
        }
    }

    /**
     * Suma todos los numeros entre 0 y 10, ambos incluidos.
     */
    public void sumValues()
    {
        // Inicializamos dos variables locales, una para el contador y otra para acumular la suma
        int index = 0;
        int value = 0;
        while (index <= 10)
        {
            // En cada iteracion sumamos el valor del indice
            value = index + value;
            index++;
        }
        System.out.println("La suma de los numeros entre 0 y 10 es " + value);
    }

    /**
     * Suma todos los valores entre dos numeros introducidos como parametros.
     */
    public void sumValuesInterval(int a, int b)
    {
        // Inicializamos dos variables locales, una para el contador y otra para acumular la suma. La suma empieza en a
        int index = 0;
        int value = 0;
        while ((index + a) <= b)
        {
            // En cada iteracion sumamos el valor del indice
            value = (index + a) + value;
            index++;
        }
        System.out.println("La suma de los numeros entre " + a + " y " + b + " es " + value);
    }

    /**
     * Comprueba si el numero introducido es primo
     */
    public boolean isPrime(int n)
    {
        // Creamos un boolean para recoger si es primo o no, y un contador para el bucle.
        // Inicializamos el bucle en 2 porque en este caso no tiene sentido inicializar en 0
        boolean isPrime = true;
        int index = 2;
        while (isPrime && (index < n))
        {
            // Si alguna division da como resto 0, ya sabemos que no es primo
            if ((n%index) == 0)
            {
                isPrime = false;
            }
            index++;
        }
        return (isPrime);
    }

}
