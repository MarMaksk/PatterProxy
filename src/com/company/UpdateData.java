package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateData {

    private static File file = new File("data.txt");

    private static final int MAX_COUNT = 15;
    private static final int MAX_NUMBERS = 100;

    public static boolean dataUpdate() {
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
            setOfNumbers += (int) (Math.random() * MAX_NUMBERS) + " ";
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
