package org.prog.poly.homework;

public class AndroidPhone implements ICellPhone{
    @Override
    public void call() {
        System.out.println("Android: call ");
    }

    @Override
    public void scanBiometrics() {
        System.out.println("Android: scan biometrics ");
    }

    @Override
    public void makePhoto() {
        System.out.println("Android: make photo ");
    }
}
