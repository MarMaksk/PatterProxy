package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Proxy doi = new Proxy(new DataOperationImpl(), new DataRetrievalImpl());
        doi.show();
        System.out.println(doi.getSum());
        System.out.println(doi.getMax());
        System.out.println(doi.getMin());
        System.out.println(doi.getAverage());
    }
}
