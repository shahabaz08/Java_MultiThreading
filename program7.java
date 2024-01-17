
public class program7 extends Thread {

    public static void main(String arg[]) {
        System.out.println("Hellow World");

        Thread.currentThread().getName();
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setName("Shahabaz");
        int iNo = 10 / 0;
    }
}