package com.homework.rm.service;

import com.homework.rm.core.Core;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/")
public class MonitorController {

    @Autowired
    private Core core;

    Logger logger = Logger.getLogger(this.getClass());

    @ResponseStatus(value = HttpStatus.OK )
    @RequestMapping(value = "/cpu-load", method = RequestMethod.GET, produces = "application/json")
    public Float cpuLoad() {
        return core.cpuLoad();
    }

    @RequestMapping(value = "/used-ram", method = RequestMethod.GET, produces = "application/json")
    public Integer currentRam() {
        return core.usedRam();
    }

    @RequestMapping(value = "/free-ram", method = RequestMethod.GET, produces = "application/json")
    public Integer freeRAM() {
        return core.freeRam();
    }

    @RequestMapping(value = "/free-drive-space", method = RequestMethod.GET, produces = "application/json")
    public Integer freeDiskSpace() {
        return core.freeDiskSpace();
    }

    @RequestMapping(value = "/used-drive-space", method = RequestMethod.GET, produces = "application/json")
    public Integer usedDiskSpace() {
        return core.usedDiskSpace();
    }

    @RequestMapping(value = "/total-disk-space", method = RequestMethod.GET, produces = "application/json")
    public Integer totalDiskSpace() {
        return core.totalDiskSpace();
    }

    @PostConstruct
    public void init() {
        logger.trace(this.getClass() + " was initialized");
    }

}
