package com.homework.rm.core.utils.ram;

import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.springframework.stereotype.Component;

@Component
public class RamInfo {

    public float usedRam() {
        try {
            Sigar sigar = new Sigar();
            double percent =  sigar.getMem().getUsedPercent();
            return (float) percent;
        } catch (SigarException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public float freeRam() {
        try {
            Sigar sigar = new Sigar();
            double persent = sigar.getMem().getFreePercent();
            return (float) persent;
        } catch (SigarException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //private float
}
