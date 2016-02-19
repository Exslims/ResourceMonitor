package com.homework.rm.core.utils.sigar;


import org.apache.log4j.Logger;

import java.util.function.Function;

public class CallWrapperUtil {
    private Logger logger = Logger.getLogger(CallWrapperUtil.class);
    public static <T> float wrapCall(Function<T, Object> function , T argument) {
        try {
            Object result = function.apply(argument);
            return Float.parseFloat(String.valueOf(result));
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return 0.0f;
    }
}
