package com.ubs.am.fxcashmania;

import com.ubs.am.fxcashmania.process.ProcessTransfers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
        implements CommandLineRunner {

    @Autowired
    ProcessTransfers processTransfers;

    private static Logger LOG = LoggerFactory
            .getLogger(Application.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(Application.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        String inputFile = "";
        LOG.info("EXECUTING : command line runner");

        for (int i = 0; i < args.length; ++i) {
            LOG.info("args[{}]: {}", i, args[i]);
            if (args[i].equalsIgnoreCase("-f")) {
                inputFile = args[i + 1];
                i++;
            }
        }
        processTransfers.process(inputFile);
    }
}