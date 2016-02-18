package com.homework.rm.service;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MonitorController {

    Logger logger = Logger.getLogger(MonitorController.class);
//
    @ResponseStatus(value = HttpStatus.OK )
    @RequestMapping(value = "/cpu-load", method = RequestMethod.GET, produces = "application/json")
    public Integer cpuLoad() {
        return 1;
    }

    @RequestMapping(value = "/current-ram", method = RequestMethod.GET, produces = "application/json")
    public Integer currentRam() {
        return 1;
    }

    @RequestMapping(value = "/total-ram", method = RequestMethod.GET, produces = "application/json")
    public Integer totalRAM() {
        return 2048;
    }

    @RequestMapping(value = "/virtual-memory", method = RequestMethod.GET, produces = "application/json")
    public Integer virtualMemory() {
        return 2048;
    }

    @RequestMapping(value = "/disk-space", method = RequestMethod.GET, produces = "application/json")
    public Integer diskSpace() {
        return 10000;
    }
}
