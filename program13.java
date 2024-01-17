//yeild method stops the current thread and gives chance to other thread to execute 
//provides hint to the thread scheduler 
// output may vary
public class program13 extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i++);
        }
    }

    public static void main(String arg[]) {
        program13 obj = new program13();
        obj.start();
        for (int i = 0; i < 5; i++) {
            Thread.yield();
            System.out.println("Hello");
        }
    }
}
