package ie.atu;

public class Passenger {

    //Declare private variables - Research why private
    private int age;

    //Constructor
    public Passenger(int a){
        age = a;
    }

    //Age method that will check if age is over 16 otherwise it will throw illegal Argument Exception
    //Research a clearer understanding on Illegal Argument Exception
    public void Age(int minAge){
        this.age = minAge;
        if(minAge > 16){
            //Do i really need anything here?
        }
        else {
            throw new IllegalArgumentException("Passenger is too young to fly. MUST be over 16");
        }
    }

    //Getter method that will return age from Passenger
    public int getAge(){
        return age;
    }


}
