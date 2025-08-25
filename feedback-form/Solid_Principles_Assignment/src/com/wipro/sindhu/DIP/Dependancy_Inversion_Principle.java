package com.wipro.sindhu.DIP;

public class Dependancy_Inversion_Principle {
    public static void main(String[] args) {
        SwitchableDevice bulb = new LightBulb();
        Switch s = new Switch(bulb);

        s.operate("on");
        s.operate("off");
    }
}

// Interface (Abstraction)
interface SwitchableDevice {
    void turnOn();
    void turnOff();
}

// Low-level class (implements interface)
class LightBulb implements SwitchableDevice {
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}

// High-level class (depends on abstraction, not implementation)
class Switch {
    private SwitchableDevice device;

    public Switch(SwitchableDevice device) {
        this.device = device;
    }

    public void operate(String action) {
        if (action.equalsIgnoreCase("on")) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}
