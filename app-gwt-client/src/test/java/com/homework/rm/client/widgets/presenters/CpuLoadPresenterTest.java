package com.homework.rm.client.widgets.presenters;

import com.google.gwt.junit.client.GWTTestCase;
import com.homework.rm.client.widgets.presenters.SensorPresenter;
import com.homework.rm.client.widgets.presenters.CpuLoadPresenter;
import org.junit.Before;
import org.junit.Test;

public class CpuLoadPresenterTest extends GWTTestCase {
    private SensorPresenter presenter = new CpuLoadPresenter(null);
    @Before
    public void before(){
        presenter = new CpuLoadPresenter(null);
    }

    @Test
    public void testCalculateAngleForArrow() throws Exception {
        int result = presenter.calculateAngleForArrow(0.f);
        assertTrue(result == 0);

        result = presenter.calculateAngleForArrow(10.f);
        assertTrue(result == 18);

        result = presenter.calculateAngleForArrow(50.f);
        assertTrue(result == 90);

        result = presenter.calculateAngleForArrow(90.f);
        assertTrue(result == 162);

        result = presenter.calculateAngleForArrow(100.f);
        assertTrue(result == 180);
    }

    @Override
    public String getModuleName() {
        return "com.homework.rm.Client";
    }
}