package org.prog.poly.homework;

public class ApplePhone implements ICellPhone{
    @Override
    public void call() {
        System.out.println("Apple: call ");
    }

    @Override
    public void scanBiometrics() {
        System.out.println("Apple: scan biometrics ");
    }

    @Override
    public void makePhoto() {
        System.out.println("Android: make photo");
    }
}
