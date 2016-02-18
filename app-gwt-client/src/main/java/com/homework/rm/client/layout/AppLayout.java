package com.homework.rm.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.homework.rm.client.widgets.LoadSensorImpl;
import com.homework.rm.client.widgets.presenters.CpuUsagePresenter;
import com.homework.rm.client.widgets.presenters.CpuUsagePresenterImpl;

/**
 * Created by Константин on 18.02.2016.
 */
public class AppLayout extends Composite {
    interface AppLayoutUiBinder extends UiBinder<HTMLPanel, AppLayout> {
    }

    private static AppLayoutUiBinder ourUiBinder = GWT.create(AppLayoutUiBinder.class);

    CpuUsagePresenter cpuUsagePresenter;

    @UiField
    LoadSensorImpl cpuUsageSensor;

    public AppLayout() {
        initWidget(ourUiBinder.createAndBindUi(this));

        cpuUsageSensor.setTitle("CPU");
        cpuUsagePresenter = new CpuUsagePresenterImpl(cpuUsageSensor);
        cpuUsagePresenter.onStart();
    }

}