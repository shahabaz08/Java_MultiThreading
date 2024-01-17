public class program5 extends Thread {

    @Override
    public void run()
    {
        System.out.println("Hellow");
        System.out.println("Hellow");
        System.out.println("Hellow");
    }
    public static void main(String Arg[])
    {
        program5 onj=new program5();
        onj.start();

        program5 obj2=new program5();
        obj2.start();
    }
    
}
