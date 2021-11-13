package org.example.Command.Case2;

public class CommandPattern {
    public static void main(String[] args) {
        Stock stock = new Stock();
        SellStock sellStock = new SellStock(stock);
        BusyStock busyStock = new BusyStock(stock);
        Broker broker = new Broker();
        broker.takeOrder(sellStock);
        broker.takeOrder(busyStock);
        broker.placeOrders();
    }
}
