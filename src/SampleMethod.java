import java.security.PrivateKey;
import java.security.PublicKey;

public class SampleMethod {

   /* Access Specifier:
    1. Public - if we declare any class as a Public, we can access that class property anywhere in project
    2. Protected  - only in specific package
    3. Private  - Only throughout the class
    4. Default - There is not any keyword for default access specifier. */
     static void myMethod() {
        System.out.println("I just got executed!");
        // static method can be called by class name -
         // className.methodNme
    }

    void method2() {
         int a = 10;
         // We need to create an object to call the non static method -
        // className obj = new className();
        // obj.methodName();
    }

    public static void main(String[] args) {
        SampleMethod obj = new SampleMethod();
        obj.method2();
        int a = 0;
        System.out.println(a);

        myMethod();

    }
}