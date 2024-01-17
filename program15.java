public class program15 extends Thread {
    static Thread mythrade;

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread" + i);
            try {
                mythrade.join();
                sleep(1000);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        program15 obj = new program15();
        mythrade = Thread.currentThread();
        obj.start();
        try {
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
