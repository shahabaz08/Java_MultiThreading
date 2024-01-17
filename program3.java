

/// using thread class 
public class program3 extends Thread {
    public void run()
    {
        System.out.println("Hii My name is Shahabaz");
        System.out.println("Hii My name is Shahabaz");
    }

    public static void main(String args[])
    {



        program3 obj=new program3();
        obj.start();

    }

    
}