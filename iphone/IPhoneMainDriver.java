package com.java.javaPhone.iphone;

import java.util.Scanner;

public class IPhoneMainDriver {
    public static void main(String[] args) {
        int again = 0, choice = 0, options = 0;
        BaseIPhone b = null;
        String iP7 = "iPhone 7", iP8 = "iPhone 8", iP10 = "iPhone 10";

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\r?\n");
        System.out.println("Select a  phone: \n1. iPhone 7; \n2. iPhone 8; \n3. iPhone 10:");
        choice = sc.nextInt();
        if (choice == 1) {
            b = new iPhone7();
            System.out.println(b.toString(iP7));
        } else if (choice == 2) {
            b = new iPhone8();
            System.out.println(b.toString(iP8));
        } else if (choice == 3) {
            b = new iPhone10();
            System.out.println(b.toString(iP10));
        } else {
            System.out.println("Enter 1, 2, or 3: \\n1. iPhone 7; \\n2. iPhone 8; \\n3. iPhone 10:");
        }
        do {
            System.out.println("What would you like to do? \n1. Check Battery Life; \n2. Charge Battery; \n3. Send message; \n4. Read message; \n5. Check Lock Status; \n6. Lock Phone; \n7. Unlock Phone:");
            options = sc.nextInt();

            switch (options) {
                case 1:
                    b.checkBattery();
                    ;
                    break;
                case 2:
                    b.chargeBattery(sc);
                    break;
                case 3:
                    b.sendMessages(sc);
                    String decoy = sc.nextLine();
                    break;
                case 4:
                    System.out.println(b.readMessages());
                    break;
                case 5:
                    b.isLocked();
                    break;
                case 6:
                    b.lockPhone();
                    break;
                case 7:
                    b.unlockPhone();
                    break;
                default:
                    System.out.println("Invalid selection: must be 1 through 7.");
            }
            if (b.batteryLevel == 50) {
                System.out.println("Battery at 50%.");
            }
            if (b.batteryLevel == 25) {
                System.out.println("Battery at 25%.");
            }
            if (b.batteryLevel <= 10 && b.batteryLevel > 0) {
                System.out.println("Battery at " + b.batteryLevel + "%; charge soon!");
            }

            if (b.batteryLevel == 0) {
                do {
                    System.out.println("Battery dead; enter 1 to charge phone.");
                    if (sc.nextInt() == 1) {
                        b.chargeBattery(sc);
                    }
                } while (b.batteryLevel == 0);
            }
            while (b.isLocked == true) {
                System.out.println("Phone locked; enter 1 to unlock.");
                if (sc.nextInt() == 1) {
                    b.unlockPhone();
                }
            }

            System.out.println("Enter 1 to perform another action");
            again = sc.nextInt();
        } while (again == 1);
    }
}