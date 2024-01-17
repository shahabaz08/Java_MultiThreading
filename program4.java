

public class program4 implements Runnable{
    @Override
    public void run()
    {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void main(String arg[])
    {
        program4 obj=new program4();
         Thread th=new Thread(obj);

         th.start();
    }

}