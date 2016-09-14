package hw2;

public class Vehicle {
    // represents vehicle information for an insurance form

    //Meant for car, truck, suv etc.
    String type;
    String make;
    String model;
    int year;
    //false if vehicle is over 10 years old
    boolean isRecent;

    Vehicle(String newType, String newMake, String newModel, int newYear, boolean newIsRecent) {
        setType(newType);
        setMake(newMake);
        setModel(newModel);
        setYear(newYear);
        setIsRecent(newIsRecent);
    }

    String getType() {
        return type;
    }

    void setType(String newType) {
        type = newType;
    }

    String getMake() {
        return make;
    }

    void setMake(String newMake) {
        make = newMake;
    }

    String getModel() {
        return model;
    }

    void setModel(String newModel) {
        model = newModel;
    }

    int getYear() {
        return year;
    }

    void setYear(int newYear) {
        if(validateIsRecent(newYear)) {
            year = newYear;
        }
        else{
            System.out.println("I call your bluff sir!");
        }
    }

    boolean getIsRecent() {
        return isRecent;
    }

    void setIsRecent(Boolean newIsRecent) {
        {
            isRecent = newIsRecent;
        }
    }

    static boolean validateIsRecent(int year) {
        return year > 1850;

    }
}
