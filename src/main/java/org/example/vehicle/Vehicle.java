package org.example.vehicle;

public abstract class Vehicle {
    protected float acceleration = 0;
    private float speed = 0;
    private boolean isOn = false;

    public String vehicleType;
    enum  TYPES {
        BUS,
        CAR;
    }

    public void setIsOn (boolean isOn) {
        this.isOn = isOn;
    }

    public  void accelerate () {
        this.speed += this.acceleration;
    }

    publica void printSpeed () {
        System.out.printf("Veículo: %s | Velocidade: %f", vehicleType, speed);
        System.out.println(this.vehicleType);
    }
}
