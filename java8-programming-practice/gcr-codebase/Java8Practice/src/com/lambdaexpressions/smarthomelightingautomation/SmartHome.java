package com.lambdaexpressions.smarthomelightingautomation;

public class SmartHome {
    public static void main(String[] args) {

        // Motion detected
        LightAction motionLight = () -> System.out.println("Lights ON at full brightness");
        
        // Night time
        LightAction nightLight = () -> System.out.println("Lights ON in dim mode");
        
        // Voice command
        LightAction voiceLight = () -> System.out.println("Lights ON with custom color");
        
        // Execute behaviors
        motionLight.activate();
        nightLight.activate();
        voiceLight.activate();
    }
}

