package com.homework.rm.core.utils.library;


import org.apache.log4j.Logger;

public class LibrariesBootstrapLoader {

    public static final String LIBRARIES_PATH = "libs";
    public static final String SIGAR_AMD64_WINNT_DLL = "sigar-amd64-winnt.dll";
    private static volatile boolean loaded = false;
    private static volatile LibrariesBootstrapLoader instance = new LibrariesBootstrapLoader();
    private Logger logger = Logger.getLogger(this.getClass().getName());

    public static synchronized LibrariesBootstrapLoader getInstance() {
        return instance;
    }

    public synchronized void loadLibraries() {
        logger.trace("Loading libraries from " + LIBRARIES_PATH);
        if (!loaded) {
            try {
                NativeUtils.loadLibraryFromJar("/" + LIBRARIES_PATH + "/" + SIGAR_AMD64_WINNT_DLL);
            } catch (Exception e) {
                logger.error(e);
            }
            loaded = true;
        }
    }
}