package java8.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


/*
reflekse dają mozliwość sprawdzenia jakie metody lub funkcje znajdują się w innej klasie która nas interesuje
daje też możliwość wywołać te medtody i funkcje w inny sposób
można sprawić by program zachował się inaczej dla tej klasy
 */
public class MainReflection {
    public static void main(String[] args) {

        try {
            Class<?> studentClas = Class.forName("java8.reflections.Student");
            Method[] methods = studentClas.getDeclaredMethods();
            Method[] allMethods = studentClas.getMethods();

            Field[] fields = studentClas.getDeclaredFields();
            Field[] allFields = studentClas.getFields();

            System.out.println("*******Declared methods*******");
            for (Method method : methods) {
                System.out.println(method);
            }
            //TODO add stream for allMethods

            System.out.println("=======All declared methods=======");
            Arrays.stream(allMethods)
                    .forEach(System.out::println);

            System.out.println("*******Declared fields*******");
            for (Field field : fields) {
                System.out.println(field);
            }
            //TODO add stream for allFields

            System.out.println("=======All declared fields=======");
            Arrays.stream(allFields)
                    .forEach(System.out::println);

            //Creating object and setting it's fields

            Student student = (Student) studentClas.newInstance();

            Method setNameMethod = studentClas.getDeclaredMethod("setName", String.class);
            Method getNameMethod = studentClas.getDeclaredMethod("getName");

            setNameMethod.invoke(student, "Florian");
            System.out.println("Reflection call");
            System.out.println(getNameMethod.invoke(student));
            System.out.println("Traditional call");
            System.out.println(student.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
