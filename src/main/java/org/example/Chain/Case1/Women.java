package org.example.Chain.Case1;

public class Women implements IWomen {

    private int type = 0;

    private String request = "";

    @Override
    public int getType() {
        return 0;
    }

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
