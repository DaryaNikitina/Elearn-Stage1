package by.nikitina.aircompany.entity;

import by.nikitina.aircompany.action.CapacityComparator;
import by.nikitina.aircompany.action.DistanceComparator;
import by.nikitina.aircompany.action.SpeedComparator;
import by.nikitina.aircompany.entity.planes.ExperimentalPlane;
import by.nikitina.aircompany.entity.planes.MilitaryPlane;
import by.nikitina.aircompany.entity.planes.PassengerPlane;
import by.nikitina.aircompany.entity.planes.Plane;

import java.util.*;

public class Airport {
    private final List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public PassengerPlane getPlaneWithMaxCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlane;
            }
        }
        return planeWithMaxCapacity;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new DistanceComparator());
        return this;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new SpeedComparator());
                return this;
    }

    public void sortByMaxLoadCapacity() {
        Collections.sort(planes, new CapacityComparator());
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }
}