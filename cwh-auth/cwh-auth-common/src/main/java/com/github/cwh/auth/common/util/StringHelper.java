package com.github.cwh.auth.common.util;

/**
 * @author cwh
 */
public class StringHelper {
    public static String getObjectValue(Object obj) {
        return obj == null ? "" : obj.toString();
    }
}
