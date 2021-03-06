package com.homework.rm.core.utils.cpu.load;



import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Component
public class CpuLoadMonitor {
    private static final String WMIC_CPU_GET_LOADPER = "wmic cpu get loadpercentage";

    public float getLoad() {
        try {
            ByteArrayOutputStream stdout = new ByteArrayOutputStream();
            PumpStreamHandler streamHandler = new PumpStreamHandler(stdout);
            CommandLine commandLine = CommandLine.parse(WMIC_CPU_GET_LOADPER);
            DefaultExecutor exec = new DefaultExecutor();
            exec.setStreamHandler(streamHandler);
            exec.execute(commandLine);
            String[] strings = stdout.toString().split("\n");
            String percent = strings[1];
            return Float.parseFloat(percent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}