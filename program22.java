class Book {
    static int Totalseats = 20;

    static synchronized public void BookT(int seats) {

        if (Totalseats >= seats) {
            System.out.println(seats + " Seats Booked Succesfully");
            Totalseats = Totalseats - seats;
            System.out.println("Total seats" + Totalseats);
        } else {
            System.out.println("Seats Are not Booked");
            System.out.println("Total seats =" + Totalseats);

        }

    }
}

class MyThread1 extends Thread {
    Book b;
    int seats;

    MyThread1(Book b, int seats) {
        this.b = b;
        this.seats = seats;

    }

    public void run() {
        b.BookT(seats);
    }
}

class Mythread2 extends Thread {
    Book b;
    int seats;

    Mythread2(Book b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.BookT(seats);
    }
}

public class program22 {

    public static void main(String arg[]) {
        Book b = new Book();
        MyThread1 t1 = new MyThread1(b, 7);
        t1.start();
        MyThread1 t2 = new MyThread1(b, 6);
        t2.start();
        Book b1 = new Book();
        Mythread2 t3 = new Mythread2(b1, 8);
        t3.start();
        Mythread2 t4 = new Mythread2(b1, 9);
        t4.start();
    }
}