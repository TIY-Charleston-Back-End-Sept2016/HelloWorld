package hw2;


public class Stormtrooper {
    String name;
    String rank;
    String legion;
    Stationed stationed;
    String[] equipment= new String[10];

    Stormtrooper(String newName, String newRank, String newLegion, Stationed newStationed, String[] newEquipment) {
        setName(newName);
        setRank(newRank);
        setLegion(newLegion);
        setStationed(newStationed);
        setEquipment(newEquipment);
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        if (isProperCode(newName)) {
            name = newName;
        }
    }

    String getRank() {
        return rank;
    }

    void setRank(String newRank) {
        rank = newRank;
    }

    String getLegion() {
        return legion;
    }

    void setLegion(String newLegion) {
        legion = newLegion;
    }

    Stationed getStationed() {
        return stationed;
    }

    void setStationed(Stationed newStationed){
        stationed = newStationed;
    }

    String[] getEquipment() {
        return equipment;
    }

    void setEquipment(String[] newEquipment) {
        equipment = newEquipment;
    }

    static boolean isProperCode(String name) {
        return name.contains ("-");
    }

}
