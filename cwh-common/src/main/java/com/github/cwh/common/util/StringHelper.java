package com.github.cwh.common.util;

/**
 * @author cwh
 */
public class StringHelper {
    public static String getObjectValue(Object obj) {
        return obj == null ? "" : obj.toString();
    }
}
