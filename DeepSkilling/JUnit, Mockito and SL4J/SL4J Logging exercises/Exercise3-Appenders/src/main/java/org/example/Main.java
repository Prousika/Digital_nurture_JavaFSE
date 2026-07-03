package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {


        log.info("Application Started");

        log.warn("Low Memory Warning");

        log.error("Database Connection Failed");

        log.info("Application Closed");

    }
}