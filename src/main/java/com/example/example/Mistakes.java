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


    public int integerOverflowExample() {
        int value = Integer.MAX_VALUE-1;
        for(int i = 0; i < 4; i++, i++) {
            value++;
        }
        System.out.println(value);

        return 4608 * 1024 * 1024;

    }
}