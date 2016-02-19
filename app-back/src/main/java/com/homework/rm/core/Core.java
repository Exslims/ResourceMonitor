package com.homework.rm.core;

import com.homework.rm.core.utils.cpu.CpuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Core {

    @Autowired
    private CpuInfo cpuInfo;

    public float cpuLoad() {
        return cpuInfo.cpuLoad();
    }

    public int usedRam() {
        return 0;
    }

    public int totalRam() {
        return 0;
    }

    public int freeRam() {
        return 0;
    }

    public int virtualMemory() {
        return 0;
    }

    public int totalDiskSpace() {
        return 0;
    }

    public int usedDiskSpace() {
        return 0;
    }

    public int freeDiskSpace() {
        return 0;
    }


//    @PostConstruct
//    public void init() {
//        LibrariesBootstrapLoader bootstrapLoader = LibrariesBootstrapLoader.getInstance();
//        bootstrapLoader.loadLibraries();
//    }

}
