package com.company;

import com.company.DataInterface.DataOperation;
import com.company.DataInterface.DataRetrieval;

import java.util.List;

public class Proxy implements DataOperation {
    private DataOperation dataOperation;
    private DataRetrieval dri;
    private List<Integer> list;
    private Logger logger = Logger.getInstance();

    public Proxy(DataOperation dataOperation, DataRetrievalImpl dataRetrieval) {
        this.dataOperation = dataOperation;
        this.dri = dataRetrieval;
        list = dri.getData();
    }

    @Override
    public int getSum() {
        return dataOperation.getSum();
    }

    @Override
    public int getMax() {
        return dataOperation.getMax();
    }

    @Override
    public int getMin() {
        return dataOperation.getMin();
    }

    @Override
    public double getAverage() {
        return dataOperation.getAverage();
    }

    @Override
    public void show() {
        dataOperation.show();
    }

    @Override
    public boolean forcedUpdate() {
        return dataOperation.forcedUpdate();
    }
}
