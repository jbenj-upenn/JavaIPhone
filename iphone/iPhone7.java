package com.java.javaPhone.iphone;

public class iPhone7 extends BaseIPhone{
    private double batteryLevel;

    @Override
    public void unlockPhone() {
        System.out.println("Unlock with TouchID");
        super.batteryLevel--;
        isLocked = false;
    }
    public void isLocked(){
        System.out.println("Phone locked: " + isLocked);
        super.batteryLevel--;
    }

    @Override
    public void chargeBattery() {

    }
}
