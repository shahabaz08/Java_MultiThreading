class Earnings extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {

            for (int i = 0; i <= 10; i++) {
                total += 100;
            }
            this.notify();
        }
    }
}

public class program24 {

    public static void main(String[] args) throws Exception {
        Earnings obj = new Earnings();
        obj.start();
        synchronized (obj) {
            obj.wait();// wecanaddtimetothis
        }
        System.out.println(obj.total);
    }
}
