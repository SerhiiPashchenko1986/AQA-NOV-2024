package org.prog.equalshashcode.homework;

/**
 * Write inheritance classes with depth of 4:
 * classA > classB > classC > classD
 *
 * Add a method to base class
 * Override that method in classB and classD slots
 *
 * Add method with overload to any class with at least 3 samples
 * method(a), method(a,b) method(a,b,c)
 */
public class OverrideOverloadHomework {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        ClassB classC = new ClassC();
        ClassB classD = new ClassD();

        classA.baseMethod();
        classB.baseMethod();
        classC.baseMethod();
        classD.baseMethod();

        classA.method("A");
        classB.method("A" , "B");
        classC.method("A" , "B" , "C");
    }
}
