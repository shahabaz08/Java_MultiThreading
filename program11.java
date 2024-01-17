public class program11 extends Thread {
    @Override
    public void run() {
        System.out.println("Hellow");

        if (Thread.currentThread().isDaemon() == true) {
            System.out.println("Daemon");
        } else {
            System.out.println("Child");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            System.out.println("Main");
        }

        program11 obj = new program11();
        obj.setDaemon(true);
        obj.start();
    }
}
