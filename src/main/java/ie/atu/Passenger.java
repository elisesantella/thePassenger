package ie.atu;

public class Passenger {

    //Declare private variables - Research why private
    private int age;
    private String name;
    private String phone;

    //Constructor
    public Passenger(int minAge){
        this.age = minAge;
        if(minAge > 16){
            age = minAge;
        }
        else {
            throw new IllegalArgumentException("Passenger is too young to fly. MUST be over 16");
        }
    }

    //Age method that will check if age is over 16 otherwise it will throw illegal Argument Exception
    //Research a clearer understanding on Illegal Argument Exception
    /*public void Age(int minAge){
        this.age = minAge;
        if(minAge > 16){
            //Do i really need anything here?
        }
        else {
            throw new IllegalArgumentException("Passenger is too young to fly. MUST be over 16");
        }
    }*/

    //Getter method that will return age from Passenger
    public int getAge(){
        return age;
    }


    //Name method that will check if name is over 3 characters otherwise it will throw illegal Argument Exception
    public void Name(String nameLength){
        this.name = nameLength;
        if(nameLength.length() >= 3){
            //Do i really need anything here?
        }
        else {
            throw new IllegalArgumentException("Name MUST be a minimum of 3 characters");
        }
    }

    //Getter method that will return age from Passenger
    public String getName(){
        return name;
    }


}
