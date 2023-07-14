package com.cyou;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //ClassLoader loader = new ClassPathClassLoader("/home/tmp/jar1");
        //ClassLoader loader = new ClassPathClassLoader("/home/tmp/jar2");
        ClassLoader loader = new ClassPathClassLoader("D:\\jar\\jar1");
        //ClassLoader loader = new ClassPathClassLoader("D:\\jar\\jar2");
        try {
            Class<?> loadClass = loader.loadClass("com.cyou.Sout");
            System.out.println(loadClass.newInstance());
            System.out.println(loadClass);
            System.out.println(Arrays.toString(loadClass.getMethods()));
            Method method = loadClass.getDeclaredMethod("print");
            method.setAccessible(true);
            method.invoke(loadClass.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}