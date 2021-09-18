package com.company;

import com.company.DataInterface.DataRetrieval;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataRetrievalImpl implements DataRetrieval {
    private File file = new File("data.txt");

    @Override
    public List<Integer> getData() {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String str = "";
            while ((str = br.readLine()) != null)
                list.add(br.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
