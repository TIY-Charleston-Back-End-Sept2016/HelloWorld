package hw2;

public class Stationed {
    String sector;
    String system;
    String planet;
    String city;

    Stationed(String newSector, String newSystem, String newPlanet, String newCity) {
        setSector(newSector);
        setSystem(newSystem);
        setPlanet(newPlanet);
        setCity(newCity);
    }

    String getSector() {
        return sector;
    }

    void setSector(String newSector) {
        if (isProperSector(newSector)) {
            sector = newSector;
        }
    }
    String getSystem() {
        return system;
    }

    void setSystem(String newSystem) {
        if (isProperSystem(newSystem)) {
            system = newSystem;
        }
    }

    String getPlanet() {
        return planet;
    }

    void setPlanet(String newPlanet) {
        planet = newPlanet;
    }

    String getCity() {
        return city;
    }

    void setCity(String newCity){
        city = newCity;
    }

    static boolean isProperSector(String sector) {
        return sector.contains (" ");
    }

    static boolean isProperSystem(String system) {
        return system.contains (" ");
    }


}
