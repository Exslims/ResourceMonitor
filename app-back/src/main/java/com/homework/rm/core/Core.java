package com.homework.rm.core;

import com.homework.rm.core.utils.cpu.CpuInfo;
import com.homework.rm.core.utils.disk.DriveInfo;
import com.homework.rm.core.utils.ram.RamInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Core {

    @Autowired
    private CpuInfo cpuInfo;

    @Autowired
    private DriveInfo driveInfo;

    @Autowired
    private RamInfo ramInfo;

    public float cpuLoad() {
        return cpuInfo.cpuLoad();
    }

    public float usedRam() {
        return ramInfo.usedRam();
    }

    public float freeRam() {
        return ramInfo.freeRam();
    }

    public int totalDiskSpace() {
        return driveInfo.totalDiskSpace();
    }

    public int usedDiskSpace() {
        return 0;
    }

    public int freeDiskSpace() {
        return 0;
    }

}
