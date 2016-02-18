package com.homework.rm.core;


import com.homework.rm.core.utils.NativeUtils;
import org.apache.log4j.Logger;

import java.io.IOException;

public class Core {

    private static Logger logger  = Logger.getLogger(Core.class);
    private static final String LIBRARY_NAME = "core.dll";
    static {
        try {
            NativeUtils.loadLibraryFromJar("/" + LIBRARY_NAME);
        } catch (IOException e) {
            logger.error(e);
        }
    }

    public native float cpuLoad();
    public native int usedRam();
    public native int totalRam();
    public native int freeRam();
    public native int virtualMemory();
    public native int totalDiskSpace();
    public native int usedDiskSpace();
    public native int freeDiskSpace();
}
