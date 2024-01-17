class thread1 extends Thread{

   public void run()
   {
     for(int i=0;i<10;i++)
    {
        System.out.println(i);

        try{
            sleep(500);
        }catch(Exception e){

        }
    }
   }
    
};

class thread2 extends Thread{

   public void run()
   {
     for(int i=0;i<20;i++)
    {
        System.out.println(i);
        try{
            sleep(500);
        }catch(Exception e){

        }
    }
   }
    
};

public class program6 {

    public static void main(String arg[])
    {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
    }
    
}
