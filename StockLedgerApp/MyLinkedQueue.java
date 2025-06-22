public class MyLinkedQueue<T> implements QueueADT<T> {
    Stock<T> front;
    Stock<T> back;

    private static class Stock<T> {
        Stock<T> numOfStocks;
        T price;
        T stockID;

        public Stock(T stockID, Stock<T> numOfStocks) {
            this.stockID = stockID;
            this.numOfStocks = numOfStocks;
        }
    }

    public MyLinkedQueue() {
        front = null;
        back = null;
    }

    @Override
    public void enqueue(T newEntry) {
        Stock<T> s = new Stock<>(newEntry, null);
        if (isEmpty()) {
            front = s;
        } else {
            back.numOfStocks = s;
        }
        back = s;
    }

    @Override
    public T dequeue() {
        T frontData = getFront();
        front = front.numOfStocks;
        if (front == null) {
            back = null;
        }
        return frontData;
    }

    @Override
    public T getFront() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return front.stockID;
    }

    @Override
    public boolean isEmpty() {
        return (front == null) && (back == null);
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Ledger is empty.  No stocks to show.");
        }
        Stock<T> c = front;
        while (c != null) {
            System.out.println("ID: " + c.stockID);
            c = c.numOfStocks;
        }
    }
}