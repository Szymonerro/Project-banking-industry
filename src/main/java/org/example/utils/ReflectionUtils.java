package org.example.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionUtils {
    public static void getClassInformation(Class<?> clazz) {
        System.out.println("Class Name: " + clazz.getName());
        System.out.println("Superclass: " + clazz.getSuperclass().getName());
        System.out.println("Modifiers: " + Modifier.toString(clazz.getModifiers()));
        System.out.println();
    }

    public static void getFieldInformation(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            Class<?> type = field.getType();
            int modifiers = field.getModifiers();

            System.out.println("Field Name: " + name);
            System.out.println("Field Type: " + type.getName());
            System.out.println("Modifiers: " + Modifier.toString(modifiers));
            System.out.println();
        }
    }

    public static void getConstructorInformation(Class<?> clazz) {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            String name = constructor.getName();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int modifiers = constructor.getModifiers();

            System.out.println("Constructor Name: " + name);
            System.out.println("Modifiers: " + Modifier.toString(modifiers));
            System.out.println("Parameter Types: ");
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("- " + parameterType.getName());
            }
            System.out.println();
        }
    }

    public static void getMethodInformation(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            Class<?>[] parameterTypes = method.getParameterTypes();
            int modifiers = method.getModifiers();

            System.out.println("Method Name: " + name);
            System.out.println("Return Type: " + returnType.getName());
            System.out.println("Modifiers: " + Modifier.toString(modifiers));
            System.out.println("Parameter Types: ");
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("- " + parameterType.getName());
            }
            System.out.println();
        }
    }


    public static void invokeMethod(Object object, String methodName) {
        try {
            Method method = object.getClass().getMethod(methodName);
            method.invoke(object);
        } catch (Exception e) {
            System.out.println("An exception occurred while invoking method " + methodName + ": " + e.getMessage());
        }
    }
}
