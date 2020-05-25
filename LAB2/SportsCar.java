/**
 * 
 * @author Tom Bill Glinton Omuom
 * Admission Number: 097292
 * Email : tom.omuom@strathmore.edu
 * @author Mandy Achieng
 * Admission Number : 093058 
 * Email : mandy.achieng@strathmore.edu
 * @author Dennis Mwangi Gikunyu
 * Admission Number : 102727
 * Email : dennis.gikunju@strathmore.edu
 */

/**
 * 
 * Sports Car car is a type of Automible and a Subclass of Vehicle
 */
class SportsCar extends Vehicle implements Automobile{    
    /**
     * 
     * This is how to accelerate the car
     */
    public void accelerate(int newIncrement){
        speed = speed + newIncrement;
        System.out.println("Acceleration speed: "+speed+" km/h");
    }

    /**
     * 
     * This is how to stop the car
     */
    public void stop(int newDecrement){
        speed = speed - newDecrement;
        System.out.println("Deceleration speed: "+speed+" km/h");
    }

    /**
     * 
     * This is how to check for gas
     */
    public void gas(int newfuelCapacity){
        fuelCapacity = newfuelCapacity;
        System.out.println("Gas: "+fuelCapacity+" litres");
    }

    @Override
    void accelerate() {
        //
        System.out.println("The vehicle is accelerating"); 
    }

    @Override
    void stop() {
        //
        System.out.println("The vehicle is coming to a stop"); 
    }

    @Override
    void gas() {
        //
        System.out.println("Please wait as the vehicle's Fuel Capacity is determined"); 
    }
}
