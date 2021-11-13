package org.example.Command.Case2;

public class BusyStock implements Order {
    private Stock abcStock;

    public BusyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.busy();
    }
}
