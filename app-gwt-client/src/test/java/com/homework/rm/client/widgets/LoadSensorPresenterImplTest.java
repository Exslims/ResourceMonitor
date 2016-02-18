package com.homework.rm.client.widgets;

import com.google.gwt.junit.client.GWTTestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoadSensorPresenterImplTest extends GWTTestCase {
    private LoadSensorPresenter presenter;
    @Before
    public void before(){
        presenter = new LoadSensorPresenterImpl(null);
    }

    @Test
    public void testCalculateAngleForArrow() throws Exception {

    }

    @Override
    public String getModuleName() {
        return "com.homework.rm.Client";
    }
}