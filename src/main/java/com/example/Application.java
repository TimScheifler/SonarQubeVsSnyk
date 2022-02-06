package com.example;

import com.example.example.Mistakes;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.client.AsyncClientHttpRequestFactory;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;

@SpringBootApplication
public class Application {



    public static void main(String[] args) throws Exception {
        Mistakes mistakes = new Mistakes();

        AsyncClientHttpRequestFactory deprecated = new OkHttp3ClientHttpRequestFactory();
        deprecated.equals("Test");

        int x = mistakes.divideByZeroExample();

        mistakes.nullPointerDereferenceExample("x");

        mistakes.dupliacateCode("x");

        mistakes.unreachableStatement();

        mistakes.memoryLeakBecauseOfStaticFieldsExample();

        mistakes.memoryLeakBecauseOfUnclosedBufferedReaderExample("src/main/resources/posts.dat");

        mistakes.integerOverflowExample();

        mistakes.indexOuOfBoundsExample();

        mistakes.sqlInjectionExample("USER",";DROP TABLE USERS");

    }
}
