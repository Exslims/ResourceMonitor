package com.homework.rm.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;


public class LoadSensorImpl extends LoadSensorBase<LoadSensorPresenter> implements HasStyleSheets {

    interface ResourceWidgetUiBinder extends UiBinder<HTMLPanel, LoadSensorImpl> {
    }

    private static ResourceWidgetUiBinder ourUiBinder = GWT.create(ResourceWidgetUiBinder.class);

    @UiField
    InlineLabel span;
    @UiField
    Label titleField;


    public LoadSensorImpl() {
        initWidget(ourUiBinder.createAndBindUi(this));
        setStyleSheets();
    }


    @Override
    public void setRadian(double value) {

    }

    @Override
    public void setUnits(int start, int end) {
    }



    @Override
    public void setTitle(String title) {
    }

    @Override
    public void setStyleSheets() {
        addStyleName("gwt-Sensor");
        span.addStyleName("gwt-Span");
        titleField.addStyleName("gwt-Title");
    }

    @Override
    public void removeStyleSheets() {
        addStyleName("gwt-Sensor");
        span.addStyleName("gwt-Span");
        titleField.removeStyleName("gwt-Title");
    }
}