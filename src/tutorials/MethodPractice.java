package tutorials;

public class MethodPractice {
    public static void main(String[] args) {
        hallo("Joshua", 22);
        System.out.println(add(3,4));

        // overloaded methods = methods that share the same name but have different parameters.
        //              method name + parameters = method signature.
        System.out.println(add("Hello"," World!"));
        System.out.println(add(3,4,5));
    }

    static void hallo(String name, int age) {
        System.out.println("Hallo " + name + "! You are " + age + " years old.");
    }

    static int add(int x, int y) {
        return(x + y);
    }

    static double add(int x, int y, double z) {
        return((x + y)/z);
    }

    static String add(String a, String b) {
        return(a + b);
    }
}
