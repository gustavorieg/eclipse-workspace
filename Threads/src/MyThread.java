public class MyThread extends Thread {
    public static int lote = 1000;
    public String comprador;
    public int quantidade;
    public int adiquirido;

    public MyThread(String comprador, int quantidade, int adiquirido) {
        this.comprador = comprador;
        this.quantidade = quantidade;
        this.adiquirido = adiquirido;
    }

    @Override
    public void run() {
        while (lote > 0) {
            synchronized (MyThread.class){
                if(lote <= 0) {
                    break;
                }
                if (quantidade > lote) {
                    quantidade = lote;
                }
                System.out.println(comprador + " comprou: " + quantidade);
                lote -= quantidade;
                adiquirido += quantidade;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Estoque zerado! \n " + comprador + " Comprou: "+ adiquirido);
    }
}
