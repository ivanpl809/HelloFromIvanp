package com.company;

public class HelloFromIvan {

    public void sayHello() {
        // The end line character happens automatically when we use
        // the println() function.
        System.out.println("Hello From Ivan");
        System.out.println("Hello Ivan, my name is Andres");
    }

    public static void main(String[] args) {
        // Create an instance of the class, and call the function.
        HelloFromIvan hello = new HelloFromIvan();
        hello.sayHello();
    }
}