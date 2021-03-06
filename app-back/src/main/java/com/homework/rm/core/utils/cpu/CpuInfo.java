package com.homework.rm.core.utils.cpu;


import com.homework.rm.core.utils.cpu.load.CpuLoadMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CpuInfo {

    @Autowired
    private CpuLoadMonitor monitor;

    public float cpuLoad() {
        return monitor.getLoad();
    }

    public void setMonitor(CpuLoadMonitor monitor) {
        this.monitor = monitor;
    }
}
