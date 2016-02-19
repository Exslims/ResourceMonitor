package com.homework.rm.client.widgets.presenters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Константин on 19.02.2016.
 */
public class RamUsagePresenterTest {
    private RamUsagePresenter presenter = new RamUsagePresenter(null);
    @Before
    public void before(){
        presenter = new RamUsagePresenter(null);
    }
    @Test
    public void testCalculateAngleForArrow() throws Exception {
        presenter.setTotalRam(8000.f);

        int result = presenter.calculateAngleForArrow(0.f);
        assertTrue(result == 0);

        result = presenter.calculateAngleForArrow(4000.f);
        assertTrue(result == 90);

        result = presenter.calculateAngleForArrow(2000.f);
        assertTrue(result == 45);
    }
}