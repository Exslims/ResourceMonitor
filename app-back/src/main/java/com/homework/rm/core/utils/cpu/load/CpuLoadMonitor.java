package com.homework.rm.core.utils.cpu.load;


import org.hyperic.sigar.ProcCpu;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;

public class CpuLoadMonitor {

    private static final int TOTAL_TIME_UPDATE_LIMIT = 2000;

    private final Sigar sigar;
    private final int cpuCount;
    private final long pid;
    private ProcCpu procCpu;
    private float load;

    public CpuLoadMonitor() throws SigarException {
        sigar = new Sigar();
        cpuCount = sigar.getCpuList().length;
        pid = sigar.getPid();
        procCpu = sigar.getProcCpu(pid);
        load = 0;
        TimerTask updateLoadTask = new TimerTask() {
            @Override
            public void run() {
                try {
                    ProcCpu curPc = sigar.getProcCpu(pid);
                    long totalDelta = curPc.getTotal() - procCpu.getTotal();
                    long timeDelta = curPc.getLastTime() - procCpu.getLastTime();
                    if (totalDelta == 0) {
                        if (timeDelta > TOTAL_TIME_UPDATE_LIMIT) load = 0;
                        if (load == 0) procCpu = curPc;
                    } else {
                        load = 100.0f * totalDelta / timeDelta / cpuCount;
                        procCpu = curPc;
                    }
                } catch (SigarException ex) {
                    throw new RuntimeException(ex);
                }
            }
        };
        new Timer(true).schedule(updateLoadTask, 0, 1000);
    }

    public float getLoad() {
        return load;
    }
}