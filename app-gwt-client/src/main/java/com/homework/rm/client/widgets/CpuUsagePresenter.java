package com.homework.rm.client.widgets;

/**
 * Created by Константин on 17.02.2016.
 */
public interface CpuUsagePresenter {
    void onChangeValue();
    void onStart();
    int calculateAngleForArrow(Float value);
}
