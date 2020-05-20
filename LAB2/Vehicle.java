/**
 * 
 * @author Tom Bill Glinton Omuom
 * Admission Number: 097292
 * Email : tom.omuom@strathmore.edu
 * @author Mandy Achieng
 * Admission Number : 093058 
 * Email : mandy.achieng@strathmore.edu
 * @author Dennis Mwangi Gikunyu
 * Admission Number : 
 * Email : dennis.gikunju@strathmore.edu
 */

/**
 * This is the Superclass
 */
abstract class Vehicle {
    /**
     * 
     * Attribute
     */
    int speed = 0;
    /**
     * 
     * Attribute
     */
    int fuelCapacity = 0;
    
    /**
     * 
     * Abstract Methods
     */
    abstract void accelerate();//Accleration of the vehicle
    abstract void stop();//Stopping the vehicle
    abstract void gas();//Checking the fuel tank of the vehicle
    
}
