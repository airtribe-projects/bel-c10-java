package org.airtribe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.airtribe.ParkingFloor.DisplayBoard;
import org.airtribe.ParkingFloor.ParkingFloor;
import org.airtribe.panels.EntryPanel;
import org.airtribe.panels.ExitPanel;
import org.airtribe.parkinglot.ParkingLot;
import org.airtribe.parkingspot.ParkingSpotType;
import org.airtribe.vehicle.Vehicle;
import org.airtribe.vehicle.VehicleColor;
import org.airtribe.vehicle.VehicleType;

// pure functions
// higher order function

@FunctionalInterface
interface MyFunction {
  int dance(int a, int b);
}

public class Main {

  public static int add(int a, int b) {
    return a + b;
  }

  public static int applyFunction(Function<Integer, Integer> function, int a) {
    return function.apply(a);
  }

  public static void main(String[] args) {
    DisplayBoard entryBoard = new DisplayBoard(UUID.randomUUID().toString(), "Airtribe Office Parking Lot Main Entrance");
    DisplayBoard exitBoard = new DisplayBoard(UUID.randomUUID().toString(), "Airtribe Office Parking Lot Main Exit");
    EntryPanel entryPanel = new EntryPanel(UUID.randomUUID().toString(), entryBoard);
    ExitPanel exitPanel = new ExitPanel(UUID.randomUUID().toString(), exitBoard);
//
//    ParkingLot multiFloorParkingLot = new ParkingLot(
//        UUID.randomUUID().toString(),
//        "Airtribe Office",
//        "Bangalore", 2, entryPanel, exitPanel);
//
//    ParkingFloor groundFloor = new ParkingFloor("Ground Floor", new DisplayBoard(UUID.randomUUID().toString(), "Ground Floor"));
//    ParkingFloor firstFloor = new ParkingFloor("First Floor", new DisplayBoard(UUID.randomUUID().toString(), "First Floor"));
//    multiFloorParkingLot.addParkingFloor(groundFloor);
//    multiFloorParkingLot.addParkingFloor(firstFloor);
//
//    groundFloor.addParkingSpot(ParkingSpotType.MEDIUM, "M1");
//    groundFloor.addParkingSpot(ParkingSpotType.LARGE, "L1");
//    groundFloor.addParkingSpot(ParkingSpotType.TWO_WHEELER, "T1");
//    groundFloor.addParkingSpot(ParkingSpotType.TWO_WHEELER, "T2");
//    groundFloor.addParkingSpot(ParkingSpotType.MEDIUM, "M2");
//    groundFloor.addParkingSpot(ParkingSpotType.MEDIUM, "M3");
//    firstFloor.addParkingSpot(ParkingSpotType.MEDIUM, "M4");
//    firstFloor.addParkingSpot(ParkingSpotType.LARGE, "L2");
//    firstFloor.addParkingSpot(ParkingSpotType.TWO_WHEELER, "T3");
//    firstFloor.addParkingSpot(ParkingSpotType.TWO_WHEELER, "T4");
//    firstFloor.addParkingSpot(ParkingSpotType.MEDIUM, "M5");
//    firstFloor.addParkingSpot(ParkingSpotType.MEDIUM, "M6");
//
//    Vehicle vehicle = new Vehicle("KA-01-HH-1234", VehicleColor.BLUE, VehicleType.CAR);
//    multiFloorParkingLot.parkVehicle(vehicle);


    List<Integer> numbers = Arrays.asList(1,2,4,10);
    System.out.println(numbers.parallelStream().map(num -> num*num).collect(Collectors.toList()));
  }




}