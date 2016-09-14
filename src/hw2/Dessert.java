package hw2;

public class Dessert {
    String dessertName;
    double dessertPrice;
    boolean isDiet;

    //    added constructor for Dessert class
    Dessert(String newName, double newPrice, boolean newIsDiet){
        setName(newName);
        setDessertPrice(newPrice);
        setDiet(newIsDiet);
    }

    String getName() {
        return dessertName;
    }

    double getPrice() {
        return dessertPrice;
    }
    boolean getDiet() {
        return isDiet;
    }

    void setName(String newName) {
        dessertName = newName;
    }
    //check if dessert is diet
    void setDessertPrice(double newPrice) {
        if (isDiet==true){
            dessertPrice = newPrice;
            System.out.println("Price changed");
        }
        else{
            System.out.println("Sorry, you can only change the price of diet dessert items.");
        }

    }
    void setDiet(boolean newIsDiet){
        isDiet = newIsDiet;
    }
}