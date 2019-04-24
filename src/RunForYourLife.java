/**
 * Write a description of class RunForYourLife here.
 *
 * @author Qurratu Aini Hasby
 * @version (a version number or a date)
 */
public class RunForYourLife implements Runnable
{
    private Thread thread;
    private String nama;
    private int jeda;

    RunForYourLife(String nama, int jeda)
    {
        this.nama = nama;
        this.jeda = jeda;
        System.out.println(nama + ", Ready");
    }

    public void run()
    {
        System.out.println(nama + ", Go!");
        try
        {
            for(int checkpoint = 1; checkpoint <= 20; checkpoint++)
            {
                System.out.println(nama + " has passed checkpoint (" + checkpoint + ")");
                Thread.sleep(jeda);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(nama + " was interrupted.");
        }
        System.out.println("\n" + nama + " has finish \n");
    }

    public void start()
    {
        System.out.println(nama + ", set ...");
        if (thread == null)
        {
            thread = new Thread (this, nama);
            thread.start();
        }
    }
}
