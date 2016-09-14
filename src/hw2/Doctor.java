package hw2;

public class Doctor {
    String name;
    int age;
    boolean isWorking;
    String[] education = new String[3];
    static int maxAge = 65;


    Doctor(String newName, int newAge, boolean isWorking, String[] newEducation){
        setName(newName);
        setAge(newAge);
        setIsWorking(isWorking);
        setEducation(newEducation);


    }

    String getName() {
        return name;
    }

    void setName(String newName){
        name = newName;
    }

    int getAge() {
        return age;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    boolean getIsWorking(){
        return isWorking;
    }

    void setIsWorking(boolean newIsWorking){
        if(age > maxAge) {
            isWorking = false;
        }
        else{
            isWorking = newIsWorking;
        }
    }

    String[] getEducation(){
        return education;
    }

    void setEducation(String[] newEducation){
        education = newEducation;
    }



}