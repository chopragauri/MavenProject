package mod5.annotations;
public class AnnotatedExample {
    public void greet(@Para(description = "This is the user's name") String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        AnnotatedExample obj = new AnnotatedExample();
        obj.greet("Gauri Chopra");
    }
}
