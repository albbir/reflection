package school;

import java.lang.reflect.*;


public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Teacher teacher = new Teacher();
        /* Class<Teacher> TeacherClass = teacher.class; */
        Class<? extends Teacher> Teacher = teacher.getClass();

        Field[] declaredFields = Teacher.getDeclaredFields();
        System.out.println("\nFields:");
        for (Field field : declaredFields) {
            System.out.println(field.getName()+"/"+field);
        }

        Constructor[] constructorUser = Teacher.getDeclaredConstructors();
        System.out.println("Constructors:");
        for (Constructor constructor : constructorUser) {
            System.out.println(constructor.getName()+"/"+constructor);
        }

        Method[] declaredMethods = Teacher.getDeclaredMethods();
        System.out.println("\nMethods:");
        for (Method method : declaredMethods) {
            System.out.println(method.getName()+"/"+method);
        }
    }
}