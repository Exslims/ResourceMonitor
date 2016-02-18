package com.homework.rm.client.widgets;

import com.google.gwt.core.client.GWT;
import com.homework.rm.client.ResourceRestService;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * Created by Константин on 18.02.2016.
 */
public class LoadSensorPresenterImpl implements LoadSensorPresenter {
    private LoadSensor sensor;
    private ResourceRestService service;

    public LoadSensorPresenterImpl(LoadSensor sensor) {
        this.sensor = sensor;
        service = GWT.create(ResourceRestService.class);
    }

    @Override
    public void onChangeValue() {
        service.getCpuLoad(new MethodCallback<Integer>() {
            @Override
            public void onFailure(Method method, Throwable exception) {

            }

            @Override
            public void onSuccess(Method method, Integer response) {
                sensor.setValue(response);
                sensor.setRadian(calculateAngleForArrow(response));
            }
        });
    }
    public int calculateAngleForArrow(Integer cpuUsage){
        return 0;
    }


}
