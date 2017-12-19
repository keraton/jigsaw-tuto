package com.greetings.tools;

import java.lang.reflect.Field;

public class Tools {

    public static String getAttribute(Object object, String attribute) {
        try {
            Field f = null; //NoSuchFieldException
            f = object.getClass().getDeclaredField(attribute);
            f.setAccessible(true);
            String field = (String) f.get(object); //IllegalAccessException
            return field;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }
}
