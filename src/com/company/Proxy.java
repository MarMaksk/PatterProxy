package com.company;

import com.company.DataInterface.DataOperation;
import com.company.DataInterface.DataRetrieval;

public class Proxy implements DataOperation {
    private DataOperation dataOperation;
    private DataRetrieval dri;
    private Logger logger = Logger.getInstance();

    public Proxy(DataOperation dataOperation, DataRetrievalImpl dataRetrieval) {
        this.dataOperation = dataOperation;
        this.dri = dataRetrieval;
        dri.getData();
    }

    @Override
    public int getSum() {

    }

    @Override
    public int getMax() {
        return 0;
    }

    @Override
    public int getMin() {
        return 0;
    }

    @Override
    public double getAverage() {
        return 0;
    }

    @Override
    public void show() {

    }

    @Override
    public int forcedUpdate() {
        return 0;
    }
}
