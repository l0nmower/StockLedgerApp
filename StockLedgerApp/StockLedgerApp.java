public class StockLedgerApp {
    public static void main(String[] args) {
        MyLinkedQueue<String> q = new MyLinkedQueue<>();

        q.enqueue("DOGE");
        q.enqueue("BTC");
        q.enqueue("SPY");

        System.out.println("Front of Ledger: " + q.getFront());
        System.out.println("\nLedger:");
        q.display();

        System.out.println("\nDequeued: " + q.dequeue());

        System.out.println("\nLedger:");
        q.display();

        System.out.println("\nDequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println();

        q.display();

        System.out.println("\nLedger empty? : " + q.isEmpty());
    }
}
