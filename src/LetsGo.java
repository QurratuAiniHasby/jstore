import java.util.Random;
/**
 * Write a description of class LetsGo here.
 *
 * @author Qurratu Aini Hasby
 * @version (a version number or a date)
 */

public class LetsGo
{
    public LetsGo()
    {
    }

    public int random(int min, int max)
    {
        if (min >= max)
        {
           throw new IllegalArgumentException("nilai int max harus lebih besar dari int min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args)
    {
        System.out.println("=====Lomba Lari=====");
        System.out.println("Ketentuan perlombaan :");
        System.out.println("-Terdapat 20 checkpoint pada rute lari");
        LetsGo go = new LetsGo(); //Buat object untuk masing-masing peserta
        RunForYourLife R1 = new RunForYourLife( "Lionel", go.random(75,100));
        RunForYourLife R2 = new RunForYourLife( "Andres", go.random(23,74));
        RunForYourLife R3 = new RunForYourLife( "Messi", go.random(5,22));

        R1.start();
        R2.start();
        R3.start();
    }
}