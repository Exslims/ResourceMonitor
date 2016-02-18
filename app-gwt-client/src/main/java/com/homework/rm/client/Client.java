package com.homework.rm.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.homework.rm.client.widgets.LoadSensorImpl;

/**
 * Created by Константин on 17.02.2016.
 */
public class Client implements EntryPoint {
    public void onModuleLoad() {
        SimplePanel panel = new SimplePanel();
        LoadSensorImpl sensor = new LoadSensorImpl();
        sensor.setUnits(0,100);
        panel.add(sensor);

        RootPanel.get("root").add(panel);
    }
}
