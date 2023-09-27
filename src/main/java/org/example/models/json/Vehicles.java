package org.example.models.json;

import org.example.models.vehicle.Vehicle;

import java.util.List;
import java.util.stream.IntStream;

public class Vehicles {
    private List<Vehicle> vehicles;

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public int[] getCountPeopleOnEachVehicle () {
        return this.vehicles.stream().mapToInt(vehicle -> vehicle.countPeople()).toArray();
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

//    public int[] listPeopleName () {
//
//        return this.vehicles.stream().mapToInt(vehicle -> vehicle.getPeople()).toArray();
//    }
}
