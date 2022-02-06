package com.example.example;

import java.util.logging.Logger;

//UnusedImport
import java.awt.image.MemoryImageSource;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Mistakes {


    private static final Logger log =  Logger.getLogger("com.example");

    /**
     * Buffer Overflow
     * <p>
     * Divide by Zero
     * <p>
     * Null Pointer Dereference
     * <p>
     * Dead Code
     * <p>
     * Memory Leak
     * <p>
     * Integer Overflow
     * <p>
     * Index out of Bounds zugriff
     * <p>
     * SQL Injection
     */

    public int divideByZeroExample() {
        return 9 / 0;
    }

    public void nullPointerDereferenceExample(String today) {
        String s = null;
        if (today.equals("monday"))
            s = "Monday";
        else if (today.equals("tuesday")) {
            s = "Tuesday";
        }
        log.info(""+s.length());
    }

    public void dupliacateCode(String today) {
        String s = null;
        if (today.equals("monday"))
            s = "Monday";
        else if (today.equals("tuesday")) {
            s = "Tuesday";
        }
        log.info(""+s.length());
    }


    //FUNKTIONIERT
    public void unreachableStatement() {
        try {
            throw new Exception("Custom Exception");
            // Unreachable code
            //System.out.println("Hello");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static List<Double> list = new ArrayList<>();

    public void memoryLeakBecauseOfStaticFieldsExample() {
        for (long i = 0; i < 100000000000L; i++) {
            list.add(Math.random());
        }
    }

    public void memoryLeakBecauseOfUnclosedBufferedReaderExample(String inputFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        System.out.println(br);
    }

    public void integerOverflowExample() {
        int value = Integer.MAX_VALUE-1;
        for(int i = 0; i < 4; i++, value++) {
            log.info(String.valueOf(value));
        }
    }

    public void indexOuOfBoundsExample() {
        int[] ar = { 1, 2, 3, 4, 5 };
        for (int i = 0; i <= ar.length; i++)
            log.info(String.valueOf(ar[i]));
    }

    public void sqlInjectionExample(String name, String password) throws Exception {
        Class.forName("org.h2.Driver");
        Statement stat;
        try (Connection conn = DriverManager.getConnection("jdbc:h2:test", "sa", "sa")) {
            stat = conn.createStatement();
        }
        ResultSet rs = stat.executeQuery("SELECT * FROM USERS WHERE " + "NAME='" + name + "' AND PASSWORD='" + password + "'");
    }

    public void deadCodeExample() {
        System.out.println("this is never printed");
    }

    public int namingConventionsExample(int example){
        int So_BeNeNnTMaN_DoCh_KeInEvArIaBlEn = example*2;
        return So_BeNeNnTMaN_DoCh_KeInEvArIaBlEn;
    }
    
}