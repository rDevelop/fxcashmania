package com.ubs.am.fxcashmania.process;

import com.ubs.am.fxcashmania.reader.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProcessTransfers {

    @Autowired
    FileReader fileReader;

    public void process(String file) {
        fileReader.readFile(file);
    }

}
