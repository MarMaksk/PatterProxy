package com.company.Proxy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static volatile Logger instance;
    private File file = new File("log.txt");

    public static Logger getInstance() {
        Logger log = instance;
        if (log == null)
            synchronized (Logger.class) {
                log = instance;
                if (log == null)
                    instance = log = new Logger();
            }
        return log;
    }

    public void log(String message) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(message);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
