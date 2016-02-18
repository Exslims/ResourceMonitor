package com.homework.rm.client.widgets;

import com.google.gwt.user.client.ui.Composite;

/**
 * Created by Константин on 17.02.2016.
 */
public abstract class LoadSensorBase<P> extends Composite {
    P presenter;

    public void setPresenter(P presenter) {
        this.presenter = presenter;
    }

    public abstract void setRadian(double value);
    public abstract void setValue(double value);
    public abstract void setTitle(String title);
}
