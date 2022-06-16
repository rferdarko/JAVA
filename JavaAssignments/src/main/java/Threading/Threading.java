package Threading;

public class Threading
{
    public static void main(String args[])
    {
        MyThreads thread1 = new MyThreads( "First Thread");
        thread1.start();

        MyThreads thread2 = new MyThreads( "Second Thread");
        thread2.start();
    }

}
