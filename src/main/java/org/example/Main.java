package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.models.json.Vehicles;

import java.io.File;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Vehicles map = mapper.readValue(new File("src/main/java/org/example/data/vehicles.json"), Vehicles.class);

        int[] counts = map.getCountPeopleOnEachVehicle();

        for (Number count : counts) {
            System.out.printf("%d%n", count.intValue());
        }

        System.out.println(map.getVehicles());
    }
}