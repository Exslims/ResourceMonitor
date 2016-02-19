package com.homework.rm.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.homework.rm.client.widgets.LoadSensorImpl;
import com.homework.rm.client.widgets.presenters.SensorPresenter;
import com.homework.rm.client.widgets.presenters.CpuLoadPresenter;

/**
 * Created by Константин on 18.02.2016.
 */
public class AppLayout extends Composite {
    interface AppLayoutUiBinder extends UiBinder<HTMLPanel, AppLayout> {
    }

    private static AppLayoutUiBinder ourUiBinder = GWT.create(AppLayoutUiBinder.class);

    SensorPresenter sensorPresenter;
    SensorPresenter ramUsedPresenter;
    SensorPresenter virtualMemPresenter;

    @UiField
    LoadSensorImpl cpuLoadSensor;
    @UiField
    LoadSensorImpl ramUsedSensor;
    @UiField
    LoadSensorImpl virtualMemSensor;

    public AppLayout() {
        initWidget(ourUiBinder.createAndBindUi(this));

        cpuLoadSensor.setTitle("CPU");
        sensorPresenter = new CpuLoadPresenter(cpuLoadSensor);
        sensorPresenter.onStart();

        ramUsedSensor.setTitle("RAM");
        ramUsedPresenter = new CpuLoadPresenter(ramUsedSensor);
        ramUsedPresenter.onStart();

        virtualMemSensor.setTitle("Virtual Memory");
        virtualMemPresenter = new CpuLoadPresenter(virtualMemSensor);
        virtualMemPresenter.onStart();
    }

}