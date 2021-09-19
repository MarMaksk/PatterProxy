package com.company;

import com.company.DataInterface.DataOperation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

public class DataOperationImpl implements DataOperation {
    private List<Integer> list;

    public void receivingData(List<Integer> list) {
        this.list = list;
    }

    @Override
    public int getSum() {
        return list.stream().reduce(Integer::sum).orElse(0);
    }

    @Override
    public int getMax() {
        return list.stream().sorted().findFirst().orElse(0);
    }

    @Override
    public int getMin() {
        return list.stream().sorted(Collections.reverseOrder()).findFirst().orElse(0);
    }

    @Override
    public double getAverage() {
        return new BigDecimal((double) getSum() / list.size())
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public void show() {
        list.forEach(System.out::println);
    }

    @Override
    public boolean forcedUpdate() {
        return new UpdateData().dataUpdate();
    }
}
