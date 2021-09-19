package com.company.DataInterface;

import java.util.List;

public interface DataOperation {

    void receivingDataByUser(List<Integer> list);

    int getSum();

    int getMax();

    int getMin();

    double getAverage();

    void show();

    boolean forcedUpdate();
}
