package com.java.javaPhone.iphone;

public class iPhone10 extends BaseIPhone{
    private double batteryLevel;

    @Override
    public void unlockPhone() {
        System.out.println("Unlock with FaceID");
        super.batteryLevel--;
    }
    public void isLocked(){
        System.out.println("Phone locked: " + isLocked);
        super.batteryLevel--;
        this.isLocked = false;
    }

    @Override
    public void chargeBattery() {

    }
}
