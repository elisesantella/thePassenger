package ie.atu;
public class Passenger {

    //Declare private variables - Research why private
    private int age;
    private String name;
    private String phone;
    private String ID;

    /*Changed method to include all variables because we want the user to be prompt to enter all information
    at once not individually using different methods*/
    public Passenger(int minAge, String nameSize, String phoneNum, String idNum){
        if(minAge > 16){
            this.age = minAge;
        }
        else{
            throw new IllegalArgumentException("Passenger is too young to fly. MUST be over 16");
        }

        //name = nameSize;
        if(nameSize.length() >= 3){
            this.name = nameSize;
        }
        else{
            throw new IllegalArgumentException("Name MUST be a minimum of 3 characters");
        }

        if(phoneNum.length() >= 7){
            this.phone = phoneNum;
        }
        else{
            throw new IllegalArgumentException("Phone number MUST be a minimum of 7 characters");
        }

        if(idNum.length() >= 10){
            this.ID = idNum;
        }
        else{
            throw new IllegalArgumentException("ID MUST be a minimum of 10 characters");
        }
    }

    //Getter method that will return age from Passenger
    public int getAge(){
        return age;
    }

    //Getter method that will return name from Passenger
    public String getName(){
        return name;
    }

    //Getter method that will return phone number from Passenger
    public String getPhone(){
        return phone;
    }

    //Getter method that will return ID from Passenger
    public String getID(){
        return ID;
    }

}
