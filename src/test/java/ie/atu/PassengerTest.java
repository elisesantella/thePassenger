package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    //file for tests
    //Do tests first

    Passenger myPassenger;

    //Set up a new object (new passenger) to be created upon set up
    //Set Age to 0 as it is being initialised
    /*IMPORTANT: OBJECT SHOULD ONLY BE CREATED IF ALL INPUTS PASS OTHERWISE NO OBJECT IS CREATED -
        could this possibly be done using another test?*/
    @BeforeEach
    void setUp(){
        myPassenger = new Passenger(0);
    }

    //Test if Passenger age is over 16 and matches the expected age within the test
    @Test
    void testPassengerAgeSuccess(){
        Passenger newPassenger = new Passenger(23);
        assertEquals(23, myPassenger.());
    }

    //Test if Passenger is under 16 and will look for Illegal Argument Exception within Passenger class
    @Test
    void testPassengerAgeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myPassenger.Age(10);});
        assertEquals("Passenger is too young to fly. MUST be over 16", exMessage.getMessage());
    }


    //Test if Passenger name is at least 3 characters and matches the expected name within the test
    @Test
    void testPassengerNameSuccess(){
        myPassenger.Name("elise");
        assertEquals("elise", myPassenger.getName());
    }

    //Test if Passenger name is under 3 characters and will look for Illegal Argument Exception within Passenger class
    @Test
    void testPassengerNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myPassenger.Name("el");});
        assertEquals("Name MUST be a minimum of 3 characters", exMessage.getMessage());
    }

    //Clear previous object of data before starting again
    @AfterEach
    void tearDown(){

    }

}