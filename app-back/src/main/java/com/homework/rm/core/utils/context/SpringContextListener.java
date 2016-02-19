package com.homework.rm.core.utils.context;

import com.homework.rm.core.utils.library.LibrariesBootstrapLoader;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SpringContextListener implements ApplicationListener<ApplicationEvent> {
    public void onApplicationEvent(ApplicationEvent argument) {
        LibrariesBootstrapLoader bootstrapLoader = LibrariesBootstrapLoader.getInstance();
        bootstrapLoader.loadLibraries();
    };
}