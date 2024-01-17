//if a thread wants wants another thread to complete then execuete then uses
//     join () method   it throws exception
public class program14 extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread" + i);
            try {
                sleep(1000);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        program14 obj = new program14();
        obj.start();
        try {
            obj.join();
        } catch (Exception e) {
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread" + i);
            try {
                sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}