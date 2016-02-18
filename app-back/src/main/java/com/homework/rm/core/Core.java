package com.homework.rm.core;


import org.apache.log4j.Logger;

public class Core {
    Logger logger  = Logger.getLogger(this.getClass().getName());
    public void sayHello() {
        logger.trace("Hello , world!");
    }
}
