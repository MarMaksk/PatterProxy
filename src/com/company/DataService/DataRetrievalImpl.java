package com.company.DataService;

import com.company.DataInterface.DataRetrieval;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataRetrievalImpl implements DataRetrieval {
    private File file = new File("data.txt");


    @Override
    public List<Integer> getData() {
        List<Integer> list = new ArrayList<>();
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String str = br.readLine();
            String[] strings = str.split(" ");
            for (String string : strings) {
                list.add(Integer.parseInt(string));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
