package com.epam.training.Asilbek_Makhmudov.aircompany;

import com.epam.training.Asilbek_Makhmudov.aircompany.Planes.ExperimentalPlane;
import com.epam.training.Asilbek_Makhmudov.aircompany.Planes.MilitaryPlane;
import com.epam.training.Asilbek_Makhmudov.aircompany.Planes.PassengerPlane;
import com.epam.training.Asilbek_Makhmudov.aircompany.Planes.Plane;
import com.epam.training.Asilbek_Makhmudov.aircompany.models.MilitaryType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {
    private final List<? extends Plane> planes;
    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }



    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : this.planes) {
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

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlane;
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
    return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> ExperimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                ExperimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return ExperimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        planes.sort(Comparator.comparingInt(Plane::Get_Max_Flight_Distance));
        return this;
    }


    /**
     * Sorts by max speed
     * @return Airport
     */
    public Airport sortByMaxSpeed() {
        planes.sort(Comparator.comparingInt(Plane::getMS));
        return this;
    }

    public void sortByMaxLoadCapacity() {
        planes.sort(Comparator.comparingInt(Plane::getMinLoadCapacity));
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
