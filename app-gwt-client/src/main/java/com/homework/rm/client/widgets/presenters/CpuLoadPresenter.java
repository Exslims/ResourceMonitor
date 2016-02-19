package com.homework.rm.client.widgets.presenters;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Timer;
import com.homework.rm.client.service.ResourceRestService;
import com.homework.rm.client.widgets.LoadSensor;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * Created by Константин on 18.02.2016.
 */
public class CpuLoadPresenter implements SensorPresenter {
    private LoadSensor sensor;
    private ResourceRestService service;

    public CpuLoadPresenter(LoadSensor sensor) {
        this.sensor = sensor;
    }


    @Override
    public void onStart() {
        service = GWT.create(ResourceRestService.class);

        Timer timer = new Timer() {
            @Override
            public void run() {
                service.getCpuLoad(new MethodCallback<Float>() {
                    @Override
                    public void onFailure(Method method, Throwable exception) {
                        sensor.setValue("Error - " + exception.getMessage());
                    }

                    @Override
                    public void onSuccess(Method method, Float response) {
                        sensor.setValue(response + "%");
                        sensor.setRadian(calculateAngleForArrow(response));
                    }
                });
            }
        };
        timer.scheduleRepeating(700);
    }

    @Override
    public int calculateAngleForArrow(Float cpuUsage){
        return (int)(cpuUsage*1.8);
    }


}
