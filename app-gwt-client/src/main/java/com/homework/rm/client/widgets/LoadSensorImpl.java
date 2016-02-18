package com.homework.rm.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;


public class LoadSensorImpl extends Composite implements HasStyleSheets,LoadSensor {

    interface ResourceWidgetUiBinder extends UiBinder<HTMLPanel, LoadSensorImpl> {
    }

    private static ResourceWidgetUiBinder ourUiBinder = GWT.create(ResourceWidgetUiBinder.class);

    @UiField
    SimplePanel content;
    @UiField
    InlineLabel span;
    @UiField
    Label titleField;
    @UiField
    Label valueField;


    public LoadSensorImpl() {
        initWidget(ourUiBinder.createAndBindUi(this));
        setStyleSheets();
    }


    @Override
    public void setRadian(double value) {
        span.getElement().getStyle().setProperty("webkitTransform","rotate(" + value + "deg)");
        span.getElement().getStyle().setProperty("transform","rotate(" + value + "deg)");
    }

    @Override
    public void setValue(double value) {
       valueField.setText(String.valueOf(value));
    }


    @Override
    public void setTitle(String title) {
        titleField.setText(title);
    }


    @SuppressWarnings("all")
    @Override
    public void setStyleSheets() {
        content.addStyleName("gwt-Sensor");
        span.addStyleName("gwt-Span");
        titleField.addStyleName("gwt-Title");
        valueField.addStyleName("gwt-ValueField");
    }
    @SuppressWarnings("all")
    @Override
    public void removeStyleSheets() {
        content.addStyleName("gwt-Sensor");
        span.addStyleName("gwt-Span");
        titleField.removeStyleName("gwt-Title");
        valueField.removeStyleName("gwt-ValueField");
    }
}