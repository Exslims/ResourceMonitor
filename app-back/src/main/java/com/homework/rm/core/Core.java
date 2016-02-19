package com.homework.rm.core;

import com.homework.rm.core.utils.cpu.CpuInfo;
import com.homework.rm.core.utils.ram.RamInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Core {

    @Autowired
    private CpuInfo cpuInfo;

    @Autowired
    private RamInfo ramInfo;

    public float cpuLoad() {
        return cpuInfo.cpuLoad();
    }

    public int usedRam() {
        return ramInfo.usedRam();
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

}
