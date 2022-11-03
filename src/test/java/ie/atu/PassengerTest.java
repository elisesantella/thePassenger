package ie.atu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    //file for tests
    //Do tests first
    //Set up a new object (new passenger) to be created upon set up
    /*IMPORTANT: OBJECT SHOULD ONLY BE CREATED IF ALL INPUTS PASS OTHERWISE NO OBJECT IS CREATED -
        could this possibly be done using another test?*/
    //Each success test is creating an object
    Passenger myPassenger;
    @BeforeEach
    void setUp(){
        //myPassenger = new Passenger( 0,null);
    }

    //Test if Passenger age is over 16 and matches the expected age within the test
    @Test
    void testPassengerAgeSuccess(){
        Passenger newPassenger = new Passenger(23,"elise", "0830152926", "G003871700");
        assertEquals(23, newPassenger.getAge());
    }

    //Test if Passenger is under 16 and will look for Illegal Argument Exception within Passenger class
    @Test
    void testPassengerAgeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger(12, "elise", "0830152926", "G003871700");});
        assertEquals("Passenger is too young to fly. MUST be over 16", exMessage.getMessage());
    }


    //Test if Passenger name is at least 3 characters and matches the expected name within the test
    @Test
    void testPassengerNameSuccess(){
        Passenger newPassenger = new Passenger(23,"elise", "0830152926", "G003871700");
        assertEquals("elise", newPassenger.getName());
    }

    //Test if Passenger name is under 3 characters and will look for Illegal Argument Exception within Passenger class
    @Test
    void testPassengerNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger(23,"el", "0830152926", "G003871700");});
        assertEquals("Name MUST be a minimum of 3 characters", exMessage.getMessage());
    }

    //Test if Passenger phone number is at least 7 characters and matches the expected number within the test
    @Test
    void testPassengerPhoneSuccess(){
        Passenger newPassenger = new Passenger(23,"elise", "0830152926", "G003871700");
        assertEquals("0830152926", newPassenger.getPhone());
    }

    //Test if Passenger phone number is under 7 characters and will look for Illegal Argument Exception within Passenger class
    @Test
    void testPassengerPhoneFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger(23,"elise", "000", "G003871700");});
        assertEquals("Phone number MUST be a minimum of 7 characters", exMessage.getMessage());
    }

    //Test if Passenger ID is at least 10 characters and matches the expected ID within the test
    @Test
    void testPassengerIDSuccess(){
        Passenger newPassenger = new Passenger(23,"elise", "0830152926", "G003871700");
        assertEquals("G003871700", newPassenger.getID());
    }

    //Test if Passenger ID is under 10 characters and will look for Illegal Argument Exception within Passenger class
    @Test
    void testPassengerIDFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger(23,"elise", "0830152926", "G00");});
        assertEquals("ID MUST be a minimum of 10 characters", exMessage.getMessage());
    }



    //Clear previous object of data before starting again
    @AfterEach
    void tearDown(){

    }

}