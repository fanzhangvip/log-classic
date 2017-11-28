package com.yunnex.git.logutils;

import android.text.TextUtils;

import ch.qos.logback.classic.BL;
import ch.qos.logback.classic.BLog;

/**
 * Created by zero on 2017/11/28.
 * Describe: function
 */

public class L {
    private final static BLog logger = BL.getLogger(L.class).tag(L.class.getSimpleName());

    private L() {
    }

    public static void d(String message, Object... args) {
        logger.d(message, args);
    }

    public static void d(Object message) {
        logger.d(message);
    }

    public static void e(String message, Object... args) {
        logger.e(message, args);
    }

    public static void e(Object message) {
        logger.e(message);
    }

    public static void w(String message, Object... args) {
        logger.w(message, args);
    }

    public static void w(Object message) {
        logger.w(message);
    }

    public static void i(String message, Object... args) {
        logger.tag("").i(message, args);
    }

    public static void i(Object message) {
        logger.tag("").i(message);
    }

    public static void v(String message, Object... args) {
        logger.v(message, args);
    }

    public static void v(Object message) {
        logger.v(message);
    }

    public static void wtf(String message, Object... args) {
        logger.wtf(message, args);
    }

    public static void wtf(Object object) {
        logger.wtf(object);
    }

    public static void json(String json) {
        logger.json(json);
    }

    public static void xml(String xml) {
        logger.xml(xml);
    }

    public static BLog tag(String tag) {
        if (TextUtils.isEmpty(tag)) {
            final String className = Thread.currentThread().getStackTrace()[3].getClassName();
            return logger.tag(className.substring(className.lastIndexOf(".")+1));
        }
        return logger.tag(tag);
    }

    public static BLog tag() {
        final String className = Thread.currentThread().getStackTrace()[3].getClassName();
        return logger.tag(className.substring(className.lastIndexOf(".")+1));
    }
}
