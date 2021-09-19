package com.company;


import com.company.DataService.DataOperationImpl;
import com.company.DataService.DataRetrievalImpl;
import com.company.Proxy.Proxy;

public class Main {

    public static void main(String[] args) {
        Proxy doi = new Proxy(new DataOperationImpl(), new DataRetrievalImpl());
        doi.show();
        System.out.println(doi.getSum());
        System.out.println(doi.getMax());
        System.out.println(doi.getMin());
        System.out.println(doi.getAverage());
        System.out.println(doi.forcedUpdate());
    }
}
