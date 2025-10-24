package mod5.annotations;
import java.lang.reflect.*;
import mod5.annotations.Para;

public class ReflectTest {
    public void greet(@Para(description = "Name of the user") String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Method method = ReflectTest.class.getMethod("greet", String.class);
        Parameter[] parameters = method.getParameters();

        for (Parameter parameter : parameters) {
            if (parameter.isAnnotationPresent(Para.class)) {
                Para para = parameter.getAnnotation(Para.class);
                System.out.println("Parameter Annotation Description: " + para.description());
                AnnotatedExample obj1 = new AnnotatedExample();
                obj1.greet("Gauri");
            }
        }
    }
}