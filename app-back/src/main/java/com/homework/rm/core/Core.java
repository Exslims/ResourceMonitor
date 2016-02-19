package com.homework.rm.core;


import java.util.Random;

public class Core {

    public float cpuLoad() {
        return new Random().nextInt(100);
    }

    public int usedRam() {
        return new Random().nextInt(8000);
    }

    public int totalRam() {
        return 8000;
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
