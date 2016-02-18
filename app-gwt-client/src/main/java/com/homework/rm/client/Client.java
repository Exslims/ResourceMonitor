package com.homework.rm.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.homework.rm.client.layout.AppLayout;
import org.fusesource.restygwt.client.Defaults;

/**
 * Created by Константин on 17.02.2016.
 */
public class Client implements EntryPoint {
    AppLayout mainLayout;
    @SuppressWarnings("all")
    public void onModuleLoad() {
        Defaults.setServiceRoot("/");
        mainLayout = new AppLayout();
        RootPanel.get("root").add(mainLayout);
    }
}
