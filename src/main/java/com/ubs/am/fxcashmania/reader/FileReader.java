package com.ubs.am.fxcashmania.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FileReader {

    private static Logger LOG = LoggerFactory
            .getLogger(FileReader.class);

    public void readFile(String file) {

        LOG.info("Reading File: " + file);
    }
}
