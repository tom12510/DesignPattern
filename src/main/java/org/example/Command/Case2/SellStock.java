package org.example.Command.Case2;

public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.shell();
    }

}
