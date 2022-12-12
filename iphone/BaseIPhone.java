package com.java.javaPhone.iphone;
import java.util.Scanner;

import com.java.javaPhone.Charger;
import com.java.javaPhone.Locker;
import com.java.javaPhone.Messenger;

public abstract class BaseIPhone implements Charger, Locker, Messenger {
    public double batteryLevel = 65;
    private String messageText = "Welcome to Messages!";
    public boolean isLocked = false;

    public String toString (String name) {
        String result = "Your phone is an {" +  name + "}\n";
        return result;
    }

    public void checkBattery(){
        System.out.println("Battery level is: " + batteryLevel);
        batteryLevel--;
    }

    @Override
    public void chargeBattery(Scanner sc) {
        double time;
        System.out.println("Enter up to 60 minutes to charge: ");
        time = sc.nextDouble();
        this.batteryLevel = batteryLevel + (time * 1.66);
        if(batteryLevel > 100){
            this.batteryLevel = 100;
        }
    }
    @Override
    public void sendMessages(Scanner sc) {
        batteryLevel--;
        System.out.println("Enter a text: ");
        this.messageText = sc.next(); //sc.nextLine() does not allow the message to be read
        System.out.println();
    }
    @Override
    public String readMessages() {
        batteryLevel--;
        return messageText;
    }
    @Override
    public void lockPhone() {
        System.out.println("Locked.");
        this.isLocked = true;
        batteryLevel--;
    }
}
