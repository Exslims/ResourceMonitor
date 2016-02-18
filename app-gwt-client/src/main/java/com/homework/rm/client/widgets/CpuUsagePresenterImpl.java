package com.homework.rm.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Timer;
import com.homework.rm.client.service.ResourceRestService;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * Created by Константин on 18.02.2016.
 */
public class CpuUsagePresenterImpl implements CpuUsagePresenter {
    private LoadSensor sensor;
    private ResourceRestService service;

    public CpuUsagePresenterImpl(LoadSensor sensor) {
        this.sensor = sensor;
    }


    @Override
    public void onChangeValue() {
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
        timer.schedule(350);
    }

    @Override
    public void onStart() {
        service = GWT.create(ResourceRestService.class);
    }

    @Override
    public int calculateAngleForArrow(Float cpuUsage){
        return (int)(cpuUsage*1.8);
    }


}
