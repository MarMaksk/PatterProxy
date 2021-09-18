package com.company.DataInterface;

import java.util.List;

public interface DataOperation {

    void receivingData(List<Integer> list);

    int getSum();

    int getMax();

    int getMin();

    double getAverage();

    void show();

    boolean forcedUpdate();
}
