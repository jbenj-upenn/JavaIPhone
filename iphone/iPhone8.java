package com.java.javaPhone.iphone;

public class iPhone8 extends BaseIPhone{
    private double batteryLevel;

    @Override
    public void unlockPhone() {
        System.out.println("Unlock with TouchID or FaceID");
        super.batteryLevel--;
        this.isLocked = false;
    }
    public void isLocked(){
        System.out.println("Phone locked: " + isLocked);
        super.batteryLevel--;
    }

    @Override
    public void chargeBattery() {

    }
}
