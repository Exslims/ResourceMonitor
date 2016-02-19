package com.homework.rm.client.widgets.presenters;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Timer;
import com.homework.rm.client.service.ResourceRestService;
import com.homework.rm.client.widgets.LoadSensor;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * Created by Константин on 19.02.2016.
 */
public class RamUsagePresenter implements SensorPresenter {
    private LoadSensor sensor;
    private ResourceRestService service;

    private Float totalRam;

    public RamUsagePresenter(LoadSensor sensor) {
        this.sensor = sensor;
    }
    @Override
    public void onStart() {
        service = GWT.create(ResourceRestService.class);
        service.getTotalRam(new MethodCallback<Float>() {
            @Override
            public void onFailure(Method method, Throwable exception) {

            }

            @Override
            public void onSuccess(Method method, Float response) {
                totalRam = response;
            }
        });

        Timer timer = new Timer() {
            @Override
            public void run() {
                service.getUsedRam(new MethodCallback<Float>() {
                    @Override
                    public void onFailure(Method method, Throwable exception) {
                        sensor.setValue("Error - " + exception.getMessage());
                    }

                    @Override
                    public void onSuccess(Method method, Float response) {
                        sensor.setValue(String.valueOf(response));
                        sensor.setRadian(calculateAngleForArrow(response));
                    }
                });
            }
        };

        timer.scheduleRepeating(500);
    }

    @Override
    public int calculateAngleForArrow(Float value) {
        float percent = (value * 100) / totalRam;
        return (int)(percent * 1.8);
    }

    public void setTotalRam(Float totalRam) {
        this.totalRam = totalRam;
    }
}
