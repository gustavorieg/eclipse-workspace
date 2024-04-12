public class Main {
    public static void main(String[] args) {
        Thread cliente1 = new MyThread("Chico", 100, 0);
        Thread cliente2 = new MyThread("Bingo", 100, 0);
        Thread cliente3 = new MyThread("Gustavo", 100, 0);
        Thread cliente4 = new MyThread("Tatiana", 100, 0);
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
    }
}