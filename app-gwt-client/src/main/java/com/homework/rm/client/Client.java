package com.homework.rm.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;
import com.homework.rm.client.widgets.CpuUsagePresenter;
import com.homework.rm.client.widgets.CpuUsagePresenterImpl;
import com.homework.rm.client.widgets.LoadSensorImpl;

/**
 * Created by Константин on 17.02.2016.
 */
public class Client implements EntryPoint {
    TextBox textBox;
    LoadSensorImpl sensor;
    CpuUsagePresenter presenter;
    public void onModuleLoad() {
        HorizontalPanel panel = new HorizontalPanel();
        sensor = new LoadSensorImpl();
        sensor.setTitle("RAM");
        panel.add(sensor);

        presenter = new CpuUsagePresenterImpl(sensor);
        presenter.onStart();
        presenter.onChangeValue();

        textBox = new TextBox();
        Button button = new Button("Click");
        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                sensor.setRadian(presenter.calculateAngleForArrow(Float.parseFloat(textBox.getText())));
            }
        });

        panel.add(textBox);
        panel.add(button);
        RootPanel.get("root").add(panel);
    }
}
