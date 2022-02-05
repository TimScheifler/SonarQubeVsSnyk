package com.example;

import com.example.example.Mistakes;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {



    public static void main(String[] args) throws Exception {
        Mistakes mistakes = new Mistakes();

        int x = mistakes.divideByZeroExample();

        mistakes.nullPointerDereferenceExample("x");

        mistakes.unreachableStatement();

        mistakes.memoryLeakBecauseOfStaticFieldsExample();

        mistakes.memoryLeakBecauseOfUnclosedBufferedReaderExample("src/main/resources/posts.dat");

        mistakes.integerOverflowExample();

        mistakes.indexOuOfBoundsExample();

        mistakes.sqlInjectionExample("USER",";DROP TABLE USERS");
    }
}
