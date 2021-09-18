package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DataOperationImpl doi = new DataOperationImpl(Arrays.asList(1, 2, 5, 4, 2, 9, 4));
        doi.show();
        System.out.println(doi.getSum());
        System.out.println(doi.getMax());
        System.out.println(doi.getMin());
        System.out.println(doi.getAverage());
    }
}
