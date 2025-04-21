package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Objects;

public class ReflectionPractice {
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

    // for Bird class
//    System.out.println("ReflectionPractice Running");
//    Bird bird = new Bird();
//    Class clazz1 = bird.getClass();
//    Class clazz2 = Bird.class;
//    Class clazz3 = Class.forName("Bird");
//    System.out.println("Class Name: " + clazz2.getName());
//    System.out.println("Modifier: " + Modifier.toString(clazz2.getModifiers()));
//    System.out.println("Simple Name: " + Arrays.toString(clazz2.getDeclaredFields()));
//
//    Method[] methods = clazz2.getDeclaredMethods();
//    for (Method method : methods) {
//      System.out.println("************************");
//      System.out.println("Method Name: " + method.getName());
//      System.out.println("Return Type: " + method.getReturnType());
//      System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
//    }
    // for Eagle Class
    Class eagleClass = Class.forName("Eagle");
    Objects eagleObject = (Objects) eagleClass.getConstructor().newInstance();

    Method flyMethod = eagleClass.getMethod("fly", int.class, int.class, int.class);
    flyMethod.invoke(eagleObject,1,2,3);

  }
}
