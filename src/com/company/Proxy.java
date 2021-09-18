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
        dataOperation.receivingData(dri.getData());
    }

    @Override
    public void receivingData(List<Integer> list) {
        this.list = list;
    }

    @Override
    public int getSum() {
        logger.log("Search sum of elements");
        return dataOperation.getSum();
    }

    @Override
    public int getMax() {
        logger.log("Search maximum of elements");
        return dataOperation.getMax();
    }

    @Override
    public int getMin() {
        logger.log("Search minimum of elements");
        return dataOperation.getMin();
    }

    @Override
    public double getAverage() {
        logger.log("Search average of elements");
        return dataOperation.getAverage();
    }

    @Override
    public void show() {
        logger.log("Show elements");
        dataOperation.show();
    }

    @Override
    public boolean forcedUpdate() {
        logger.log("Start forced update to file");
        return dataOperation.forcedUpdate();
    }
}
