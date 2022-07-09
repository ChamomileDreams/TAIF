class Pause {

    public static void pause(int time)
    {
        try
        {
            Thread.sleep(time);
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
}