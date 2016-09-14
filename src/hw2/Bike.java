package hw2;

public class Bike {
    String brand;
    String model;
    int size;
    String color;

    Bike(String newBrand, String newModel, int newSize, String newColor) {
        setBrand(newBrand);
        setModel(newModel);
        setSize(newSize);
        setColor(newColor);
    }

    String getBrand() {
        return brand;
    }

    void setBrand (String newBrand) {
        if(isValidBrand(newBrand))
            brand = newBrand;
    }

    String getModel() {
        return  model;
    }

    void setModel (String newModel) {
        model = newModel;
    }

    int getSize() {
        return size;
    }
    void setSize (int newSize){
        size = newSize;
    }
    String getColor() {
        return color;
    }
    void setColor(String newColor) {
        color = newColor;
    }
    static boolean isValidBrand (String brand) { return brand.contains("Specialized");}
}