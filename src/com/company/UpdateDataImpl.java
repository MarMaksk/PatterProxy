package com.company;

import com.company.DataInterface.UpdateData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateDataImpl implements UpdateData {

    private File file = new File("data.txt");

    private final int MAX_COUNT = 15;
    private final int MAX_NUMBERS = 100;

    @Override
    public boolean dataUpdate() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int count = (int) ((Math.random() * MAX_COUNT) + 2);
        String setOfNumbers = "";
        for (int i = 0; i < count; i++) {
            setOfNumbers += Math.random() * MAX_NUMBERS + " ";
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(setOfNumbers);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
