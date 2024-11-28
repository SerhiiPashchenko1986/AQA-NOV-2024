package org.prog.equalshashcode.homework;

public class ClassB extends ClassA {
    @Override
    public void baseMethod() {
        System.out.println("Метод baseMethod перевизначено у ClassB");
    }
    public void method(String a, String b) {
        System.out.println("Метод з двома параметрами: " + a + ", " + b);
    }

    public void method(String a, String b, String c) {
    }
}
